package in.mindcraft.AnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		MobilePhone m1 = (MobilePhone) cxt.getBean("mobilePhone");
		m1.show();

	}

}
