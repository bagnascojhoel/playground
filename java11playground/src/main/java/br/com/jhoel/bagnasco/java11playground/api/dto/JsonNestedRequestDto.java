package br.com.jhoel.bagnasco.java11playground.api.dto;

import br.com.jhoel.bagnasco.java11playground.api.annotation.JsonNested;
import lombok.Value;


@Value
public class JsonNestedRequestDto {

    @JsonNested("customer.info.name")
    String name;

    @JsonNested("customer.password")
    String password;

}
