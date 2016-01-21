package pattern.abstractfactory;

public class JapaneseUIFactory implements UIAbstractFactory{

	@Override
	public Help getHelp() {
		return new JapaneseHelpImpl();
	}

	@Override
	public Images getImages() {
		return new JapaneseImagesImpl();
	}

	@Override
	public Locale getLocale() {
		return new JapaneseLocaleImpl();
	}

}
