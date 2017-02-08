package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SampleAppApplication.class, args);
		String []names=ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		for(String bean:names)
			System.out.println(bean);
	}
}
