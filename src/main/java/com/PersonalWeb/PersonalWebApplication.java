package com.PersonalWeb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.PersonalWeb.mapper")
public class PersonalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalWebApplication.class, args);
    }

}

