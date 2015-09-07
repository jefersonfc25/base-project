package br.com.jeferson;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ConfigStaticResource  extends WebMvcConfigurerAdapter {
	
	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
			"classpath:/META-INF/resources/", "classpath:/resources/",
			"classpath:/static/", "classpath:/public/" };
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	if (!registry.hasMappingForPattern("/**")) {
    		registry.addResourceHandler("/**").addResourceLocations(
    				CLASSPATH_RESOURCE_LOCATIONS );
    	}
    	if (!registry.hasMappingForPattern("/bower_components/**")) {
    		registry.addResourceHandler("/bower_components/**").addResourceLocations(
    				"classpath:/public/bower_components/");
    	}
    }
}
