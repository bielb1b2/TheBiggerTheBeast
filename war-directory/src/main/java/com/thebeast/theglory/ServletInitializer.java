package com.thebeast.theglory;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ThegloryApplication.class);
	}

	private static Class<ServletInitializer> applicationClass = ServletInitializer.class;

}
