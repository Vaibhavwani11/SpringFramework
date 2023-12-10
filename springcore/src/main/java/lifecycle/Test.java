package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/lifecycleconfig.xml");
		
		Samosa obj = (Samosa)context.getBean("s1");
		System.out.println(obj);
		
//	===========================================================================================

		//destroy method is not called by default, we need to register a "registerShutdownHook()" and call "registerShutdownHook()" method on context.
		AbstractApplicationContext context2= new ClassPathXmlApplicationContext("lifecycle/lifecycleconfig.xml");
		Samosa obj2= (Samosa)context2.getBean("s1");
		
	
		System.out.println(obj2);
		context2.registerShutdownHook();
		
		InterfacesExample obj1= (InterfacesExample)context.getBean("i1");
		System.out.println(obj1);
		
		UsingAnnotations obj3 = (UsingAnnotations) context.getBean("u1");
		System.out.println("obj3");
	}

}
