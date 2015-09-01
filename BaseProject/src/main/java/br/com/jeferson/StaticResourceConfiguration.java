package br.com.jeferson;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
    @Override
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	
    	if (!registry.hasMappingForPattern("/BaseProject/**")) {
    		registry.addResourceHandler("/BaseProject/**").addResourceLocations("classpath:/static/");
		}
		if (!registry.hasMappingForPattern("/bower_components/**")) {
			registry.addResourceHandler("/bower_components/**").addResourceLocations("/bower_components/");
		}
		if (!registry.hasMappingForPattern("/css/**")) {
			registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		}
		if (!registry.hasMappingForPattern("/img/**")) {
			registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		}
		if (!registry.hasMappingForPattern("/js/**")) {
			registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		}
		if (!registry.hasMappingForPattern("/fonts/**")) {
			registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/");
		}
		
	}
}