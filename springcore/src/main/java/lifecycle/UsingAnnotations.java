package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotations {

	private float a;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "UsingAnnotations [a=" + a + ", getA()=" + getA() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public UsingAnnotations(float a) {
		super();
		this.a = a;
	}

	public UsingAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		
		System.out.println("In init method: initialized using annotation @PostConstruct");
	}
	
	@PreDestroy
	public void end() {
		
		System.out.println("In destroy method: initialized using annotation @PreDestroy");
	}
}
