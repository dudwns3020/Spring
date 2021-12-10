package com.exam.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.exam.demo.interceptor.BeforeActionInterceptor;
import com.exam.demo.interceptor.NeedLoginInterceptor;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

	@Autowired
	BeforeActionInterceptor beforeActionInterceptor;
	@Autowired
	NeedLoginInterceptor needLoginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		InterceptorRegistration ir;
		
		ir = registry.addInterceptor(beforeActionInterceptor);
		ir.addPathPatterns("/**");
		ir.addPathPatterns("/favicon.ico");
		ir.addPathPatterns("/resource/**");
		ir.addPathPatterns("error");

		ir = registry.addInterceptor(needLoginInterceptor);
		ir.addPathPatterns("/usr/article/write");
		ir.addPathPatterns("/usr/article/doDelete");
		ir.addPathPatterns("/usr/article/modify");
		ir.addPathPatterns("/usr/article/doModify");
		ir.addPathPatterns("/usr/article/doDelete");
		ir.addPathPatterns("/usr/reactionPoint/doGoodReaction");
		ir.addPathPatterns("/usr/reactionPoint/doBadReaction");
	}
}
