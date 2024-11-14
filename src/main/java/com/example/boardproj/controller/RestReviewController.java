package com.example.boardproj.controller;

import com.example.boardproj.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/review")
public class RestReviewController {

    @GetMapping("/a")
    public String a (String a) {
        log.info(a);

        return "신짱구";
    }

    @PostMapping("/b")
    public String b (String name) {
        log.info(name);

        name = name + "님 환영합니다.";

        return name;
    }

    @PutMapping("/c")
    public String c (String name) {
        log.info(name);

        name = name + "님의 리뷰입니다.";

        return name;
    }

    @GetMapping("/d")
    public String d (BoardDTO boardDTO) {
        log.info(boardDTO);

        return boardDTO.getContent();
    }

    @PostMapping("/e")
    public String e (BoardDTO boardDTO) {
        log.info(boardDTO);

        return boardDTO.getContent();
    }

}
