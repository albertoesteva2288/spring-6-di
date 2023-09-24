package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
