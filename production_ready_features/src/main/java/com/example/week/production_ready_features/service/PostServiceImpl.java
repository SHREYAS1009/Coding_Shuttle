package com.example.week.production_ready_features.service;


import com.example.week.production_ready_features.dto.PostDTO;
import com.example.week.production_ready_features.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostServiceImpl implements PostService
{

    private  PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }



    @Override
    public List<PostDTO> getAllPosts()
    {
        return null;

    }

    @Override
    public PostDTO  createNewPost(PostDTO inputPost)
    {
        return null;
    }



}
