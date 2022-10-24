package ru.clevertec.ecl.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.clevertec.ecl.inercetor.DeleteInterceptor;
import ru.clevertec.ecl.inercetor.GetInterceptor;
import ru.clevertec.ecl.inercetor.PostInterceptor;
import ru.clevertec.ecl.inercetor.PutInterceptor;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    private final GetInterceptor getInterceptor;
    private final DeleteInterceptor deleteInterceptor;
    private final PutInterceptor putInterceptor;
    private final PostInterceptor postInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getInterceptor);
        registry.addInterceptor(deleteInterceptor);
        registry.addInterceptor(putInterceptor);
//        registry.addInterceptor(postInterceptor);
    }
}
