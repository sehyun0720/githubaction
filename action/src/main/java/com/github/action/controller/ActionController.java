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

    @GetMapping("/action2")
    public String getStringTest2() {
        return "github action practice22344567782";
    }

    @GetMapping("/action3")
    public String getStringTest3() {
        return "github action practice3";
    }
}
