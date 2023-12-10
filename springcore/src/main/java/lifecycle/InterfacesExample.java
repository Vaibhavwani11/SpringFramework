package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfacesExample implements InitializingBean, DisposableBean{

	private double x;	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "IntefacesExample [x=" + x + "]";
	}

	public InterfacesExample(double x) {
		super();
		this.x = x;
	}

	public InterfacesExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		//init method
		
		System.out.println("in init method: initialised using initializingBean interface");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		//destroy method
		System.out.println("in destroy method: initialised using DisposableBean  interface");

	}
	
	
}
