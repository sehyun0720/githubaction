package com.github.action.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ActionController {

    @GetMapping("/action")
    public String getStringTest() {
        return "github action practice";
    }
}
