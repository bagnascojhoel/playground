package br.com.jhoel.bagnasco.java11playground.api.annotation;

import br.com.jhoel.bagnasco.java11playground.api.JsonNestedDeserializer;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@JacksonAnnotationsInside
@JsonDeserialize(using = JsonNestedDeserializer.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonNested {

    String value();

}
