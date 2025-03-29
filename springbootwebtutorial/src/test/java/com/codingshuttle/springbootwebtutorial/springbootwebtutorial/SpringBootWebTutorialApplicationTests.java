package com.codingshuttle.springbootwebtutorial.springbootwebtutorial;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.ProductEntity;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringBootWebTutorialApplicationTests {

	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void testRepository()
	{
       ProductEntity productEntity = ProductEntity.builder()
			   .sku("sku_26")
			   .price(BigDecimal.valueOf(2345.98))
			   .quantity(2).build();

	   productRepository.save(productEntity);


	}

	@Test
	void getRepository()
	{
		List<ProductEntity> productRepositoryList = productRepository.findByTitle("pepsi");

		System.out.println(productRepositoryList);
	}

	@Test
	void getRepositoryAfterDate()
	{
		List<ProductEntity> productEntityList=productRepository.findByCreatedTimeAfter(LocalDateTime.of(2025,01,02,23,45,13));
		System.out.println(productEntityList);
	}




}
