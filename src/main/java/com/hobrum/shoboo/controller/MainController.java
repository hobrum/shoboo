package com.hobrum.shoboo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/view")
    public String init() {

        return "first-view";

    }

}
