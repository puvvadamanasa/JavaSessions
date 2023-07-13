package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest() {
		int i=9/0;
	}

}
