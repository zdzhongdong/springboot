package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * springboot的入口
 * @author Administrator
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.controller"})
public class T extends SpringBootServletInitializer{
//	
//	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//
//          return application.sources(T.class);
//
//  }
	public static void main(String[] args) {
		SpringApplication.run(T.class, args);

	}
	
	

}
