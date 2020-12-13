package com.example.demo;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface MyRepository extends JpaRepository<MyEntity, Long> {
}
