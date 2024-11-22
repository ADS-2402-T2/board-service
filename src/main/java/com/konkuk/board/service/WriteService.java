package com.konkuk.board.service;

import com.konkuk.board.entity.Post;
import com.konkuk.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WriteService {

    private final BoardRepository boardRepository;

    public void save(Post post){
        boardRepository.save(post);
    }
}
