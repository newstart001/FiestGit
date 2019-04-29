package com.firstdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.firstdemo.controller.interceptor.OneInterceptor;
import com.firstdemo.controller.interceptor.TwoInterceptor;

//使用注解配置拦截器
@Configuration
					      //继承WebMvcConfigurerAdapter
public class WebMvcConfig extends WebMvcConfigurerAdapter{

	//重写addInterceptors 添加所需的拦截器地址
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//	拦截器按照顺序执行
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
		
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
													 .addPathPatterns("/one/**");
	
		super.addInterceptors(registry);
	}
}
