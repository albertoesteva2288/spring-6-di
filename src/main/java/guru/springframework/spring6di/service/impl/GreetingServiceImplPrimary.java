package guru.springframework.spring6di.service.impl;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GreetingServiceImplPrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the primary bean";
    }
}
