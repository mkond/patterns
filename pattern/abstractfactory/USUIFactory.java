package pattern.abstractfactory;

public class USUIFactory implements UIAbstractFactory {

	@Override
	public Help getHelp() {
		return new USHelpImpl();
	}

	@Override
	public Images getImages() {
		return new USImagesImpl();
	}

	@Override
	public Locale getLocale() {
		return new USLocaleImpl();
	}

}
