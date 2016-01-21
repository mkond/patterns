package pattern.factorymethod;

import java.io.File;

import org.w3c.dom.Document;

public class FactoryMethod {
	
	public AbstractWriter getWriter(Object object){
		
		AbstractWriter writer = null;
		if(object instanceof File){
			writer = new ConcreteFileWriter();
		}else if(object instanceof Document){
			writer = new ConcreteXmlWriter();
		}
		return writer;
	} 

}
