package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext context;

	@Autowired
	MyController myController;

	@Test
	void testAutowiredController(){
		System.out.println("Testing autowired controller");
		System.out.println(myController.sayHello());
	}
	@Test
	void testGetControllerFromContext() {
		System.out.println("Testing controller from context");
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

}
