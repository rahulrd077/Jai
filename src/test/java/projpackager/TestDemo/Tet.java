package projpackager.TestDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tet{

@Test

public void Firstmethod() {
	System.out.println("Test 1");
	Assert.assertTrue(true);
	
	
	
}

@Test

public void Secondtmethod() {
	
	System.out.println("Test 2");
	
	Assert.assertTrue(false);
	
	



}

}