package com.example.boardproj.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Log4j2
public class ReviewController {

    @GetMapping("/review")
    public void review() {

    }
}
