package pattern.abstractfactory;

import java.util.Arrays;
import java.util.TreeSet;

public class AbstractFactoryMain {
	
	public static void main(String[] args){
		
        WebSite websitelocale = new WebSite();
        websitelocale.run("DE");


	}

}
interface Help{public String getHelpCountry();}
interface Images {public String getImagesCountry();}
interface Locale {public String getLocaleCountry();}
//japan implementation
class JapaneseHelpImpl implements Help{
	public String getHelpCountry() {
		return "Japan help";
	}
}
class JapaneseImagesImpl implements Images{
	public String getImagesCountry() {
		return "Japan images";
	}
}
class JapaneseLocaleImpl implements Locale{
	public String getLocaleCountry() {
		return "Japan locale";
	}
}
//us implementation
class USHelpImpl implements Help{
	public String getHelpCountry() {
		return "USA help";
	}
}
class USImagesImpl implements Images{
	public String getImagesCountry() {
		return "USA images";
	}
}
class USLocaleImpl implements Locale{
	public String getLocaleCountry() {
		return "USA locale";
	}
}
//abstact factory = couples factorymethods
interface UIAbstractFactory {	
    public Help getHelp();
    public Images getImages();
    public Locale getLocale();
    
}
//japan abst factory
class JapaneseUIFactory implements UIAbstractFactory{
	public Help getHelp() {
		return new JapaneseHelpImpl();
	}
	public Images getImages() {
		return new JapaneseImagesImpl();
	}
	public Locale getLocale() {
		return new JapaneseLocaleImpl();
	}
}
//us abstr factory
class USUIFactory implements UIAbstractFactory {
	public Help getHelp() {
		return new USHelpImpl();
	}
	public Images getImages() {
		return new USImagesImpl();
	}
	public Locale getLocale() {
		return new USLocaleImpl();
	}
}

class WebSite {
	
	public UIAbstractFactory run(String countryId){
		UIAbstractFactory abstrfactory = null;
		switch (countryId) {
		case "JP":
			abstrfactory = new JapaneseUIFactory();
			log(abstrfactory);
			return new JapaneseUIFactory();
		case "EN":	
			abstrfactory = new USUIFactory();
			log(abstrfactory);
			return new USUIFactory();
		default:
			throw new RuntimeException("no existing language like - "+countryId);
		}
	} 
	private void log(UIAbstractFactory abstrfactory){
		if(abstrfactory != null){
			Help help = abstrfactory.getHelp();
			System.out.println("help created for: "+help.getHelpCountry());
			
			Images images = abstrfactory.getImages();
			System.out.println("UI images created for: " + images.getImagesCountry());
			
            Locale locale = abstrfactory.getLocale();
            System.out.println("UI locale created for: " + locale.getLocaleCountry());

		}
    }

}