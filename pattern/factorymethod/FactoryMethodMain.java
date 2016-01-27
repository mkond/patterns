package pattern.factorymethod;

import java.util.Date;

public class FactoryMethodMain {

	public static void main(String[] args) {
		WatchMaker watchmaker = getMakerByName("misha");
		Watch watch = watchmaker.createWatch();
		watch.showTime();
		
	}
	
	public static WatchMaker getMakerByName(String maker){
		if(maker.equals("Digital"))
			return new DigitalWatchMaker();
		else if(maker.equals("Rome"))
			return new RomeWatchMaker();	
		
		throw new RuntimeException("no existing render like - "+maker);
	}

}
interface Watch{
	void showTime();
}
class DigitalWatch implements Watch{
	public void showTime() {
		System.out.println(new Date().getHours()+":"+new Date().getMinutes());
	}
}
class RomeWatch implements Watch{
	public void showTime() {
		System.out.println("VII-XX");
	}
}
interface WatchMaker{
	Watch createWatch();
}
class DigitalWatchMaker implements WatchMaker{
	public Watch createWatch(){
		return new DigitalWatch();
	}
}
class RomeWatchMaker implements WatchMaker{
	public Watch createWatch(){
		return new RomeWatch();
	}
}