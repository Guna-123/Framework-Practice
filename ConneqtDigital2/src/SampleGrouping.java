

import org.testng.annotations.Test;

public class SampleGrouping {
	
	
	@Test(groups = "G1")
	public void hello() {
		
		System.out.println("Group 1 is printed");
		
	}
	@Test
	public void Apple() {
		System.out.println("Normal Test------------------");
	}
	
	
	@Test(groups = "G1")
	public void ello2(){
		System.out.println("Group 2 is Printed");
	}
	
	

}
