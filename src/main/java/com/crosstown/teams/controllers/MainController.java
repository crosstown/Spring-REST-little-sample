package com.crosstown.teams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author F.S.(Crosstown)
 * @date 11/27/2017
 * @time 12:27 PM
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "hello";
    }
}
