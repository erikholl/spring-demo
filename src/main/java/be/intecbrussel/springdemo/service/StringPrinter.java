package be.intecbrussel.springdemo.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
@Lazy
public class StringPrinter {
    private StringProvider provider;

    public StringPrinter(StringProvider provider) {
        System.out.println("Creating string printer");
        this.provider = provider;
    }

    @PostConstruct
    public void print() {
        System.out.println(provider.giveString());
    }

    @PreDestroy
    public void cleanUp() {

    }
}
