package pattern.facade;

public class FacadeMain {

	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.copy();
	}

}

class Computer{
	Power power = new Power();
	DVDRom dvd = new DVDRom();
	HDD hdd = new HDD();
	
	void copy(){
		power.on();
		dvd.load();
		hdd.copyFromDVD(dvd);
	}
	
}
class Power{
	public void on(){
		System.out.println("Power ON");
	}
	
	public void off(){
		System.out.println("Power )FF");
	}
}
class DVDRom{
	private boolean data = false;
	
	public boolean hasData(){
		return data;
	}
	public void load(){
		data = true;
	}
	public void unload(){
		data = false;
	}
}
class HDD{
	void copyFromDVD(DVDRom dvd){
		if(dvd.hasData()){
			System.out.println("Copy data");
		}else{
			System.out.println("Load dvd!");
		}
	}
}