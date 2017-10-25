package com.hj.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@ServletComponentScan
@EnableEurekaServer
@SpringBootApplication
public class ServerApp
{
    public static void main( String[] args )
    {
       SpringApplication.run(ServerApp.class, args);
    }
}
