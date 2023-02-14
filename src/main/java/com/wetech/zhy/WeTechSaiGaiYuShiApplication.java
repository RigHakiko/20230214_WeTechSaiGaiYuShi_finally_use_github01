package com.wetech.zhy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wetech.zhy.mapper")
public class WeTechSaiGaiYuShiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeTechSaiGaiYuShiApplication.class, args);
    }

}
