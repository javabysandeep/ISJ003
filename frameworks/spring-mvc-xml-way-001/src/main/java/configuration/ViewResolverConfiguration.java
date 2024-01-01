package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"controller"})
public class ViewResolverConfiguration {
    @Bean
    public InternalResourceViewResolver getResolver() {
        InternalResourceViewResolver ivr = new InternalResourceViewResolver();
        ivr.setPrefix("/webapp/");
        ivr.setSuffix(".html");
        return ivr;
    }
}
