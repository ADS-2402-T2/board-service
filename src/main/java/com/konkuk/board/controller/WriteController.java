package com.konkuk.board.controller;

import com.konkuk.board.entity.Post;
import com.konkuk.board.service.WriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board/w")
@RequiredArgsConstructor
public class WriteController {

    private final WriteService writeService;

    @GetMapping("")
    public String postForm(){
        return "board/postForm";
    }

    @PostMapping("/save")
    public String save(@RequestParam String title,
                       @RequestParam String text,
                       Model model){

        Post post = new Post();
        post.setTitle(title);
        post.setText(text);

        writeService.save(post);

        model.addAttribute("post", post);

        return "board/post";
    }
}
