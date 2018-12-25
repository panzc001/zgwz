package com.gsroot.zgwz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gsroot.zgwz.mapper")
public class ZgwzApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZgwzApplication.class, args);
    }

}

