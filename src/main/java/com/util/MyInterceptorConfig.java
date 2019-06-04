package com.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Component
public class MyInterceptorConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
	/**
	 * 放过静态资源
	 */
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
	    }
	
}
