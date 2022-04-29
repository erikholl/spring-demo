package be.intecbrussel.springdemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("elon")
public class HelloElon implements StringProvider {

    @Override
    public String giveString() {
        System.out.println("Creating Hello Elon");
        return "Hello Elon";
    }
}
