package br.com.dev.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/{name}")
    public String test(String name) {
        return "Olá " + name;
    }


    @GetMapping("/some/{n1}/{n2}")
    public Long soma(Long n1, Long n2) {
        return n1 + n2;
    }

}
