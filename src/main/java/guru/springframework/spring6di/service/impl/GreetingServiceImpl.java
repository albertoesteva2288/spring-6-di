package guru.springframework.spring6di.service.impl;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from base service!!!";
    }
}
