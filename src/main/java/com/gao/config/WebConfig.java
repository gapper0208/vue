package com.gao.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.gao.web.controller.IntegerConverter;

// for test...
@Configuration
public class WebConfig {
	@Autowired
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
	/*
	 @PostContruct是spring框架的注解，在方法上加该注解会在项目启动的时候执行该方法，
	 也可以理解为在spring容器初始化的时候执行该方法。
	 */
	@PostConstruct
	public void addConvertsionConfig() {
		ConfigurableWebBindingInitializer initializer = //
				(ConfigurableWebBindingInitializer) requestMappingHandlerAdapter.getWebBindingInitializer(); 
		if(initializer.getConversionService() != null) {
			GenericConversionService conversionService = (GenericConversionService) initializer.getConversionService();
			// conversionService.addConverter(new IntegerConverter());
		}
	}
	
	
}
