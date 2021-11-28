package br.com.jhoelbagnasco.jsonnested.controller;

import br.com.jhoelbagnasco.jsonnested.dto.DemoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public DemoDto findDemoDto() {
        return new DemoDto("my name");
    }

}
