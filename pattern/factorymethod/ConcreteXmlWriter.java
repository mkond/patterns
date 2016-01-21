package pattern.factorymethod;

public class ConcreteXmlWriter extends AbstractWriter {

	public void write(Object context) {
		System.out.println(this.getClass().getName());
	}
}
