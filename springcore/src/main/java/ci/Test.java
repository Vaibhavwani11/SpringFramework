package ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ci/ciconfig.xml");
		Person p = (Person)context.getBean("p1");
		
		System.out.println(p);
		
		Addition a = (Addition)context.getBean("add");
		a.doSum();
	}

}
