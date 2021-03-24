package UserRegistation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
		
	@Test
	public void givenString_WhenNull_ShouldReturnFalse() {
		String testString = null;
		try {
			UserValidation.validatePattern(testString, UserValidation.firstNameRegExpPattern);
			} catch (UserValidationException e) {
			  Assert.assertEquals("please enter input which is not null", e.getMessage());
			}
	}

	@Test
	public void givenString_WhenEmpty_ShouldReturnFalse() {
		String testString = "";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.firstNameRegExpPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenString_WhenWrong_ShouldReturnFalse() {
		String testString = "Ashawani";
		try {
			UserValidation.validatePattern(testString, UserValidation.lastNameRegExpPattern);
			} catch (UserValidationException e) {
			  Assert.assertEquals("please enter input which is not wrong ", e.getMessage());
			}
	}

	@Test
	public void givenString_Whenwrong_ShouldReturnFalse() {
		String testString = "";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.lastNameRegExpPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenString_WhenEmail_ShouldReturnFalse() {
		String testString = "abc@gmail.com.aa.ac";
		try {
			UserValidation.validatePattern(testString, UserValidation.emailRegExpPattern);
			} catch (UserValidationException e) {
			  Assert.assertEquals("please enter input which is not email ", e.getMessage());
			}
	}

	@Test
	public void givenString_Whenemail_ShouldReturnFalse() {
		String testString = "";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.emailRegExpPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenString_WhenmobileFormat_ShouldReturnFalse() {
		String testString = "8500907412";
		try {
			UserValidation.validatePattern(testString, UserValidation.mobileFormatRegExpPattern);
			} catch (UserValidationException e) {
			  Assert.assertEquals("please enter input which is not mobileNumber ", e.getMessage());
			}
	}

	@Test
	public void givenString_Whenmobileformat_ShouldReturnFalse() {
		String testString = "";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.mobileFormatRegExpPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenString_WhenpasswordRules_ShouldReturnFalse() {
		String testString = "bridgelabz@co.in";
		try {
			UserValidation.validatePattern(testString, UserValidation.passwordRulesRegExpPattern);
			} catch (UserValidationException e) {
			  Assert.assertEquals("please enter input which is not password ", e.getMessage());
			}
	}

	
	@Test
	public void givenString_Whenpasswordrules_ShouldReturnFalse() {
		String testString = "";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.passwordRulesRegExpPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
}
