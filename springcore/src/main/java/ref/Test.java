package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ref/refconfig.xml");
		
		A obj = (A)context.getBean("aref");
		B obj1 = (B)context.getBean("bref");
		
		System.out.println(obj.getX());
		System.out.println(obj.getObj());
		System.out.println(obj.getObj().getY());
	
		System.out.println(obj1.getY());
	}

}
