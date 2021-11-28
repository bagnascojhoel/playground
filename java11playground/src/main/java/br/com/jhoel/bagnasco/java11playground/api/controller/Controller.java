package br.com.jhoel.bagnasco.java11playground.api.controller;

import br.com.jhoel.bagnasco.java11playground.api.domain.UserMustacheTest;
import br.com.jhoel.bagnasco.java11playground.api.dto.JsonNestedRequestDto;
import br.com.jhoel.bagnasco.java11playground.api.dto.MustacheTemplateDto;
import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class Controller {

    private final Mustache.Compiler compiler;

    @GetMapping("/mustache")
    public String buildTemplateWithMustache() {
        Template template = compiler.loadTemplate("checkout-to-user");
        MustacheTemplateDto dto = MustacheTemplateDto.builder()
            .user(UserMustacheTest.builder().cpfCnpj("044.721.700-35").name("Jhoel Galeano").build())
            .productName("Batata frita")
            .totalPrice(new BigDecimal("35.43"))
            .build();
        
        return template.execute(dto);
    }

    @PostMapping("/json-nested")
    public boolean unpackNestedJson(@RequestBody JsonNestedRequestDto requestDto) {
        System.out.println(requestDto);
        return true;
    }

}
