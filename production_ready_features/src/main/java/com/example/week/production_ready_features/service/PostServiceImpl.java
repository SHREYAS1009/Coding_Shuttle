package com.example.week.production_ready_features.service;


import com.example.week.production_ready_features.dto.PostDTO;
import com.example.week.production_ready_features.entity.PostEntity;
import com.example.week.production_ready_features.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor


public class PostServiceImpl implements PostService
{

    //private PostDTO postDTO;
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<PostDTO> getAllPosts()
    {
      return postRepository
              .findAll()
              .stream()
              .map(postEntity -> modelMapper.map(postEntity,PostDTO.class))
              .collect(Collectors.toList());

    }

    @Override
    public PostDTO createNewPost(@RequestBody PostDTO inputPost)
    {
        PostEntity postEntity = modelMapper.map(inputPost,PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),PostDTO.class);


    }

    @Override
    public PostDTO getpostbyId(Long id)
    {

        PostEntity postEntity= postRepository.findById(id).orElseThrow(()->new RuntimeException("Post Id not found"));
        return modelMapper.map(postEntity,PostDTO.class);

    }
}
