package cn.ekgc.addrbook.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>Addrbook Consumer 启动类</b>
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AddrbookConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrbookConsumerStarter.class,args);
	}
}
