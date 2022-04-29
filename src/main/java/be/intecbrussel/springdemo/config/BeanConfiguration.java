package be.intecbrussel.springdemo.config;

import be.intecbrussel.springdemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfiguration {

//    @Bean
//    @Profile("world")
//    @Scope("prototype")
//    public StringProvider getWorldProvider() {
//        return new HelloWorld();
//    }

//    @Bean
//    @Profile("elon")
//    public StringProvider getElonProvider() {
//        return new HelloElon();
//    }

    @Bean
    public StringPrinter printer(@Autowired StringProvider provider) {
        // @Autowired is NOT required; it is automatically done by Spring
        StringPrinter printer = new StringPrinter(provider);
        printer.print();
        return printer;
    }

    @Bean
    public AnotherStringPrinter anotherPrinter(StringProvider provider) {
        return new AnotherStringPrinter(provider);
    }

}
