package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {

    @Test
    void sayHello(){
        MyController controller = new MyController();
        System.out.println(controller.sayHello());
    }
}
