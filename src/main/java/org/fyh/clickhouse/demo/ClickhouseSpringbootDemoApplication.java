package org.fyh.clickhouse.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.fyh.clickhouse.demo.mapper")
public class ClickhouseSpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickhouseSpringbootDemoApplication.class, args);
    }

}
