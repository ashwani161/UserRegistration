package UserRegistation;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
	public static final String firstNameRegExpPattern =  "^[A-Z][a-zA-Z]{3,3}";
	public static final String lastNameRegExpPattern =  "^[A-Z][a-zA-Z]{3,3}";
	public static final String emailRegExpPattern =  "^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9][^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.][a-z^la]*)$";
	public static final String mobileFormatRegExpPattern =  "^(91\\s*[7-9][0-9]{9})$";
	public static final String passwordRulesRegExpPattern =  "^(?=.[A-Z])(?=.[0-9])(?=.*[!@#&()-[{}]:;',?/~$^+=<>]).{8,8}$";

public static boolean validatePattern(String argument, String regExp) throws UserValidationException {
	
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(argument);
		if(matcher.matches()) {
			return true;
		}else {
			throw new UserValidationException("please enter valid input");
			
		}
}
public static void ifValidOuput(String regExpString, String[] testSamples) {
	for (String testString : testSamples) {
		try {
			if (validatePattern(testString, regExpString)) {
				System.out.println(" Valid : ");
			}else
				System.out.println(" Invalid : ");
		} catch (UserValidationException e) {
			System.out.println(e.getMessage());
		}
	}
}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration system to ensure all Validations");
		System.out.println("Enter your first name");
		String[] firstName = {"Ashu", "Ashwani", "Ash"};
		ifValidOuput(firstNameRegExpPattern, firstName);
		
		System.out.println("Enter your last name");
		String[] lastName = {"Maddi", "maddy", "Ma"};
		ifValidOuput(lastNameRegExpPattern, lastName);

		System.out.println("Enter your email");
		String[] email = {"ashu@gmail.com", "Ashwani65@gmial.com", "sai123@yahoo.com"};
		ifValidOuput(emailRegExpPattern, email);

        System.out.println("Enter your mobile format");
        String[] mobileFormat = {"91 9584247545", "91 8500907412", "91 9658731458"};
		ifValidOuput(mobileFormatRegExpPattern, mobileFormat);

		System.out.println("Enter your password rules");
		String[] passwordRules = {"Ashu@123", "bridge@5", "suresh$2"};
		ifValidOuput(passwordRulesRegExpPattern, passwordRules);


	}

}