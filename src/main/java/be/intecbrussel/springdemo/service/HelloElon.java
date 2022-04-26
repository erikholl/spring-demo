package be.intecbrussel.springdemo.service;

public class HelloElon implements StringProvider {
    @Override
    public String giveString() {
        return "Hello Elon";
    }
}
