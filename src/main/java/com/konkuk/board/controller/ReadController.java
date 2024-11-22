package com.konkuk.board.controller;

import com.konkuk.board.dto.PostDto;
import com.konkuk.board.service.ReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board/r")
@RequiredArgsConstructor
public class ReadController {

    private final ReadService readService;

    @GetMapping("")
    public String getPostList(Model model){
        List<PostDto> postDtoList = readService.getPostList();
        model.addAttribute("posts", postDtoList);
        return "board/list";
    }

    @GetMapping("/{id}")
    public String getPost(@PathVariable Long id, Model model){
        PostDto post = readService.getPostById(id);
        model.addAttribute("post", post);
        return "board/post";
    }

}
