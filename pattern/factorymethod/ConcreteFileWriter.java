package pattern.factorymethod;

public class ConcreteFileWriter extends AbstractWriter {

	public void write(Object context) {
		System.out.println(this.getClass().getName());	
	}
}
