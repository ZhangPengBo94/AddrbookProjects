package cn.ekgc.addrbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>Addrbook Providers启动类</b>
 */
@MapperScan("cn.ekgc.addrbook.dao")
@EnableEurekaClient
@SpringBootApplication
public class AddrbookProvidersStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrbookProvidersStarter.class,args);
	}
}
