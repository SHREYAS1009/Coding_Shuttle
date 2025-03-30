package com.example.week.production_ready_features.contoller;

import com.example.week.production_ready_features.dto.PostDTO;
import com.example.week.production_ready_features.service.PostService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor
@RequestMapping(path="/posts")
public class PostController
{
    private final PostService postService;
    public PostController(PostService postService)
    { // Manually added constructor
        this.postService = postService;
    }

    @GetMapping
    public List<PostDTO> getAllPosts()
    {
        return postService.getAllPosts();

    }

    @PostMapping
    public PostDTO createNewPost(@RequestBody PostDTO inputPost)
    {
        return postService.createNewPost(inputPost);

    }

    @GetMapping("/{postId}")
    public PostDTO getpostbyID(@PathVariable Long id)
    {
        return postService.getpostbyId(id);
    }


}
