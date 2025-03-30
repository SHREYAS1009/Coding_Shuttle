package com.example.week.production_ready_features.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError
{
    private LocalDateTime timestamp;
    private String error;
    private HttpStatus code;


    public ApiError() {
        timestamp = LocalDateTime.now();
    }

    public ApiError(String error, HttpStatus code)
    {
        this();
        this.error = error;
        this.code = code;
    }
}
