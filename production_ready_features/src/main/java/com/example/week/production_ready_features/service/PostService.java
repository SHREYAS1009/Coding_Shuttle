package com.example.week.production_ready_features.service;

import com.example.week.production_ready_features.dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService
{

    List<PostDTO> getAllPosts();
    PostDTO  createNewPost(PostDTO inputPost);



}
