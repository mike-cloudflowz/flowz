package flowz.cloudflowz.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
    
    @Bean
    public InternalResourceViewResolver viewResolver() {
     InternalResourceViewResolver resolver = new InternalResourceViewResolver();
     resolver.setPrefix("/WEB-INF/jsp/");
     resolver.setSuffix(".jsp");
     return resolver;
    }
}
