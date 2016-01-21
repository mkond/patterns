package pattern.singletone;

public final class Singletone {
	
	private static Singletone instance = new Singletone();
	
	private Singletone(){}
	
	public static Singletone getSingletone(){
		return instance;
	}

}
