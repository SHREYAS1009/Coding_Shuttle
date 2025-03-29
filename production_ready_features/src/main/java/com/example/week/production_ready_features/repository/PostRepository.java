package com.example.week.production_ready_features.repository;

import com.example.week.production_ready_features.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,Long> {



}
