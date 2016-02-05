package pattern.prototype;

public class Prototype {

	public static void main(String[] args) {
		
		Human original = new Human(21, "Petia");
		System.out.println(original);
		
		Human copy = (Human)original.copy();
		System.out.println(copy);


	}
}

interface Copyable{
	Object copy();
}

class Human implements Copyable{
	int age;
	String name;
	
	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + "]";
	}

	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Copyable copy() {
		Human copy = new Human(age, name);
		return copy;
	}
	
}




