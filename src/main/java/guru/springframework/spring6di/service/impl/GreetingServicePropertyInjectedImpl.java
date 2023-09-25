package guru.springframework.spring6di.service.impl;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.stereotype.Service;

@Service(value = "propertyGreetingService")
public class GreetingServicePropertyInjectedImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!!";
    }
}
