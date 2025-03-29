package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.ProductEntity;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/products")
public class ProductController
{
    private final Integer PAGE_SIZE=3;
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository)
    {
        this.productRepository=productRepository;

    }

    @GetMapping
    public Page<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy,
                                              @RequestParam(defaultValue = "0") Integer pageNumber)
    {
        //return productRepository.findBy(Sort.by(Sort.Direction.DESC,sortBy,"price","quantity"));

        Pageable pageable= PageRequest.of(pageNumber,PAGE_SIZE);

        return productRepository.findAll(pageable);


    }





}
