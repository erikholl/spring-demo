package be.intecbrussel.springdemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("world")
public class HelloWorld implements StringProvider {

    @Override
    public String giveString() {
        System.out.println("creating a HelloWorld StringProvider..");
        return "Hello World";
    }
}
