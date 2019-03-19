package it.reply.bootcamp.rand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class RandApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandApplication.class, args);
	}

}
