package com.example.week.production_ready_features.dto;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PostDTO
{
    private Long id;

    private String title;

    private String description;
}
