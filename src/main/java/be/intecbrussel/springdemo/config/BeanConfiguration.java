package be.intecbrussel.springdemo.config;

import be.intecbrussel.springdemo.service.HelloElon;
import be.intecbrussel.springdemo.service.HelloWorld;
import be.intecbrussel.springdemo.service.StringPrinter;
import be.intecbrussel.springdemo.service.StringProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfiguration {
    @Bean
    @Profile("world")
    public StringProvider getWorldProvider() {
        return new HelloWorld();
    }

    @Bean
    @Profile("elon")
    public StringProvider getElonProvider() {
        return new HelloElon();
    }

    @Bean
    public StringPrinter printer(StringProvider provider) {
        StringPrinter printer;
        if (provider != null) printer = new StringPrinter(provider);
        else printer = new StringPrinter(() -> "Hello from the " +
                "bean configuration");
        printer.print();
        return printer;
    }

}
