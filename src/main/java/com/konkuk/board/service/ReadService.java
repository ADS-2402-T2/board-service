package com.konkuk.board.service;

import com.konkuk.board.dto.PostDto;
import com.konkuk.board.entity.Post;
import com.konkuk.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReadService {

    private final BoardRepository boardRepository;
    public List<PostDto> getPostList(){
        List<Post> posts = boardRepository.findAll();

        return posts.stream()
                .map(Post::toDto).toList();
    }

    public PostDto getPostById(Long id){
        Post posts = boardRepository.findById(id).orElseThrow();

        return posts.toDto();
    }
}
