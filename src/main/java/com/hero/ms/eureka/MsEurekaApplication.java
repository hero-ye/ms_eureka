package com.hero.ms.eureka;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Log
@EnableEurekaServer
@SpringBootApplication
public class MsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEurekaApplication.class, args);
        log.info("已启动");
    }

}
