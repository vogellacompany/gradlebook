import java.util.Date;

public class Library {
    public boolean someLibraryMethod() { 
		String test = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		Integer three = Integer.valueOf(3);
		three.equals(test); 
		
		return true;
    }

    // the jacoco plugin will find out that this method has not been tested
    public boolean someOtherUntestedMethod() {
		return true;
    }
}
