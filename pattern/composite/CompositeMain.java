package pattern.composite;

import java.util.ArrayList;

public class CompositeMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		Square s2 = new Square();
		Triangle t1 = new Triangle();
		Circle circle = new Circle();
		
		Composite c1 = new Composite();
		Composite mainComposite = new Composite();
		
		c1.addComponent(s1);
		c1.addComponent(s2);
		c1.addComponent(t1);
		mainComposite.addComponent(circle);
		mainComposite.addComponent(c1);

		mainComposite.draw();
	}
}

interface Shape{
	void draw();
}
class Square implements Shape{
	public void draw() {
		System.out.println("Draw "+getClass().getSimpleName());
	}
}
class Triangle implements Shape{
	public void draw() {
		System.out.println("Draw "+getClass().getSimpleName());
	}
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Draw "+getClass().getSimpleName());
	}
}

class Composite implements Shape{
	private ArrayList<Shape> components = new ArrayList<>();
	
	public void addComponent(Shape component){
		components.add(component);
	}
	public void removeComponent(Shape component){
		components.remove(component);
	}
	
	public void draw() {
		for(Shape component:components){
			component.draw();
		}
	}
}