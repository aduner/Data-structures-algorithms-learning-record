import java.io.Serializable;

/**
 * @author Aduner
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 2L;

	private String name;
	private Integer age;
	private String address;

	public Person() {
	}

	public Person(String name, Integer age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}
}
