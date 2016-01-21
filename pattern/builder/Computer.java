package pattern.builder;

public class Computer {
	
	private String display = null;
	private String systemBlock = null;
	private String manipulators = null;
	
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
