package com.fansmac.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//使用1，采用Spring Cloud提供的注册发现客户端注解@EnableDiscoveryClient，使用2，采用Eureka提供的注解EnableEurekaClient
@EnableDiscoveryClient
//@EnableEurekaClient
@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

}
