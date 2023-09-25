package guru.springframework.spring6di.service.impl;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey!!!, I'm setting a greeting. ;D";
    }
}
