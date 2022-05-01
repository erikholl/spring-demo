package be.intecbrussel.springdemo.service;

import org.springframework.stereotype.Service;

//@Service
public class AnotherStringPrinter {
    private StringProvider stringProvider;

    public AnotherStringPrinter(StringProvider provider) {
        System.out.println("Creating anotherStringPrinter..");
        this.stringProvider = provider;
    }

    public void print() {
        System.out.println(stringProvider.giveString());
    }

}
