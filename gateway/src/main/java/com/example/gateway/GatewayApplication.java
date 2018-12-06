package com.example.gateway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

  @Bean
  CommandLineRunner discoveryClientRunner(DiscoveryClient client) {
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        System.out.println("Available Services:");
        client.getServices().forEach(System.out::println);
      }
    };
  }

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }
}
