package be.intecbrussel.springdemo.service;

// just to explain how Spring 'knows' when to create an object for a Bean in
// @Lazy
public class StringProviderProxy implements StringProvider {
    private StringProvider provider;

    @Override
    public String giveString() {
        this.provider = new HelloElon();
        return this.provider.giveString();
    }

    // proxyMode can be set in the BeanConfiguration
    // proxyMode = ScopedProxyMode.INTERFACES
    // proxyMode = ScopedProxyMode.SINGLE_CLASS
}
