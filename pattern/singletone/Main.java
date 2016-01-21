package pattern.singletone;

public class Main {
	
	public static void main(String[] args){
		
		Singletone s1 = Singletone.getSingletone();
		Singletone s2 = Singletone.getSingletone();
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	

}
