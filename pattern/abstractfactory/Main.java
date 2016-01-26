package pattern.abstractfactory;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args){
		
        TestClient test = new TestClient();
        
        System.out.println("Run example for Japan");
        String countryCode = "JP";
        test.run(countryCode);

        System.out.println("Run example for US");
        countryCode = "US";
        test.run(countryCode);

        System.out.println("Run example for DE");
        countryCode = "DE";
        test.run(countryCode);
        
        
        System.out.println("-------------------------");
        
        Object a = new Integer[10];
        System.out.println(a.getClass().toString());
        Object[] b = new Integer[10];
        System.out.println(b.getClass().isArray());
    
		
	}

}
