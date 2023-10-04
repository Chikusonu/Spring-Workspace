package in.mindcraft.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Laptop lap=(Laptop)context.getBean("l1");
		lap.show();
	}

}