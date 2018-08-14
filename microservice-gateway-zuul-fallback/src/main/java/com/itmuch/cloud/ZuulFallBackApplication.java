package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulFallBackApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulFallBackApplication.class, args);
  }

  @Bean
  public MyFallbackProvider myFallbackProvider() {
    return new MyFallbackProvider();
  }
}
