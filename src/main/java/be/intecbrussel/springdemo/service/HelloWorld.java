package be.intecbrussel.springdemo.service;

public class HelloWorld implements StringProvider {
    @Override
    public String giveString() {
        return "Hello World";
    }
}
