package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>
{

    List<ProductEntity> findByTitle(String title);
    List<ProductEntity> findAllByOrderByPrice();
    List<ProductEntity> findBy(Sort sort);
    List<ProductEntity> findByCreatedTimeAfter(LocalDateTime localDateTime);


}
