package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "product_table",
        uniqueConstraints = {

                @UniqueConstraint(name="title_price_unique", columnNames = {"title_X","price"})

        },

        indexes = {
                @Index(name="price_index",columnList = "price")
        }





)
public class ProductEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length=20)
    private String sku;

    @Column(name="title_X")
    private String title;

    private BigDecimal price;

    private Integer quantity;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @UpdateTimestamp
    private LocalDateTime updateAt;





}
