package guru.springframework.spring6di.service.i18n;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "EN")
@Service(value = "i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}