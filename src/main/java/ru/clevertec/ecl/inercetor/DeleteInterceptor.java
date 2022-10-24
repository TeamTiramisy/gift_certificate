package ru.clevertec.ecl.inercetor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import reactor.core.publisher.Mono;
import ru.clevertec.ecl.dto.ErrorDto;
import ru.clevertec.ecl.exception.ResourceNotFoundException;
import ru.clevertec.ecl.util.Constant;
import ru.clevertec.ecl.util.Port;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class DeleteInterceptor implements HandlerInterceptor {

    private final WebClient webClient;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();
        Integer serverPort = request.getServerPort();


        Map<String, String> attribute = (Map) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        Integer id = Integer.parseInt(attribute.get(Constant.FIELD_NAME_ID));

        if (serverPort.equals(Port.getPort(id))){
            return true;
        }

        if (method.equals(HttpMethod.DELETE.name())) {
            webClient
                    .delete()
                    .uri(Constant.URL_BASE + Port.getPort(id) + request.getRequestURI())
                    .retrieve()
                    .onStatus(HttpStatus::is4xxClientError, resp ->
                            resp.bodyToMono(ErrorDto.class)
                                    .flatMap(error ->
                                            Mono.error(new ResourceNotFoundException(Constant.FIELD_NAME_ID, id, Constant.ERROR_CODE))))
                    .bodyToMono(Void.class)
                    .block();
            response.setStatus(HttpStatus.NO_CONTENT.value());
        }
        return true;
    }

}

