package com.makeamiracle.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(){
        return "<style>body{color:#ff6348; font-family: Helvetica}</style>".concat("Make a Miracle (API) is running ...");
    }
}