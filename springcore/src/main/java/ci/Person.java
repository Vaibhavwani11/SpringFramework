package ci;

import com.springcore.collections.Employee;

//Constructor Injection tricky ahe, trial errors karun paha!!!
public class Person {

	private String name;
	private int personId;
	private float height;
	private Employee emp;
	
	public Person(String name, int personId, float height, Employee emp) {
		
		this.name = name;
		this.personId = personId;
		this.height = height;
		this.emp = emp;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", height=" + height + ", emp=" + emp + "]";
	}
	
}
