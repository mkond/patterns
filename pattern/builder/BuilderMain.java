package pattern.builder;

public class BuilderMain {
	
	public static void main(String[] args){
		
		Director director = new Director();
		ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
		
		director.setComputerBuilder(cheapComputerBuilder);
		director.constructComputer();
		
		Computer computer = director.getComputer();
		
		System.out.println(computer.getComputerInfo());
		
	}

}
//-------------------------------------------------------------
class Computer {
	
	private String display = "Sumsung";
	private String systemBlock = "Sumsung";
	private String manipulators = "Sumsung";
	
	public void setDisplay(String display) {
		this.display = display;
	}
	public void setSystemBlock(String systemBlock) {
		this.systemBlock = systemBlock;
	}
	public void setManipulators(String manipulators) {
		this.manipulators = manipulators;
	}
	
	public String getComputerInfo(){
		return "display: "+display+"\nsystemBlock: "+systemBlock+"\nmanipulators: "+manipulators;
	}

}

abstract class ComputerBuilder {
	  protected Computer computer;

	  public Computer getComputer() { 
	    return computer; 
	  }
	  
	  public void createNewComputer() {
	    computer = new Computer(); 
	  }

	  public abstract void buildSystemBlock();
	  public abstract void buildDisplay();
	  public abstract void buildManipulators();
	}
//--------------------------------------------------------------
class CheapComputerBuilder extends ComputerBuilder {
	
	public void buildSystemBlock() {
		computer.setSystemBlock("Everest");

	}
	public void buildDisplay() {
		computer.setDisplay("CRT");

	}
	public void buildManipulators() {
		computer.setManipulators("mouse+keyboard");

	}

}
//------------------------------------------------------------------------
class Director {
	private ComputerBuilder computerBuilder;

	public void setComputerBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}

	public Computer getComputer() {
		return computerBuilder.getComputer();
	}
	
	public void constructComputer(){
		computerBuilder.createNewComputer();
		computerBuilder.buildSystemBlock();
//		computerBuilder.buildDisplay();
		computerBuilder.buildManipulators();
	}
	

}
