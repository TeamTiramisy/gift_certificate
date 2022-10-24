package ru.clevertec.ecl.inercetor;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.socket.adapter.UndertowWebSocketSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import ru.clevertec.ecl.entity.User;
import ru.clevertec.ecl.util.Constant;
import ru.clevertec.ecl.util.Port;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class PostInterceptor implements HandlerInterceptor {
//
//    private final WebClient webClient;
//    private final EntityManager entityManager;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String method = request.getMethod();
//        Integer serverPort = request.getServerPort();
//        Query query = entityManager.createNativeQuery("select t.last_value from tag_id_seq t");
//
//        BigInteger seq = (BigInteger) query.getSingleResult();
//        Integer id = seq.intValue();
//        System.out.println(id);
//
//
//        if (serverPort.equals(Port.getPort(id))){
//            return true;
//        }
//
//        if (method.equals(HttpMethod.PUT.name())){
//            StringBuilder s = new StringBuilder();
//            BufferedReader reader = request.getReader();
//            while (reader.ready()){
//                s.append(reader.readLine());
//            }
//            String s1 = s.toString();
//
//            Object block = webClient
//                    .put()
//                    .uri(Constant.URL_BASE + Port.getPort(id) + request.getRequestURI())
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .body(BodyInserters.fromValue(s1))
//                    .retrieve()
//                    .bodyToMono(Object.class)
//                    .block();
//
//            String json = new Gson().toJson(block);
//            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//            response.getWriter().write(json);
//        }
//
//        return false;
//    }

}

