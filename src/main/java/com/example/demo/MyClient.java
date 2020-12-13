package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "myclient", url = "http://localhost:8080")
public interface MyClient {

    @GetMapping("/ds")
    String ds();

}
