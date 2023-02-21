package com.wetech.zhy;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wetech.zhy.mapper")
@Slf4j
public class WeTechSaiGaiYuShiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeTechSaiGaiYuShiApplication.class, args);
    }

}
