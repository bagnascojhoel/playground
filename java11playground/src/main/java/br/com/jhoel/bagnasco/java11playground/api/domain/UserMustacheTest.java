package br.com.jhoel.bagnasco.java11playground.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class UserMustacheTest {

    public String name;
    public String cpfCnpj;

}
