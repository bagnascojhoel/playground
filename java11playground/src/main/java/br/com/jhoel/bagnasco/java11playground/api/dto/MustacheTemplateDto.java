package br.com.jhoel.bagnasco.java11playground.api.dto;

import br.com.jhoel.bagnasco.java11playground.api.domain.UserMustacheTest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class MustacheTemplateDto {

    public UserMustacheTest user;
    public String productName;
    public BigDecimal totalPrice;

}
