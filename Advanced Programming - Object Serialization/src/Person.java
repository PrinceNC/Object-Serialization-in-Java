import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7260877684654746408L;
	private String name;
	private int age;
	
	Person() {
		this.name = "";
		this.age = 0;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
			
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
