package br.com.jhoelbagnasco.jsonnested.config;

import br.com.jhoelbagnasco.jsonnested.converter.JsonNestedHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(createJsonNested());
    }

    private HttpMessageConverter<Object> createJsonNested() {
        var objectMapper = Jackson2ObjectMapperBuilder.json().build();

        return new JsonNestedHttpMessageConverter(objectMapper);
    }

}
