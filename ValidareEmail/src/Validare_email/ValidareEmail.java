package Validare_email;

import java.util.regex.Pattern;

public class ValidareEmail {
	
	public static void main(String[] args) {
		String email1= "info@infomar.com";
		String email2 = "infoinfomar.com";
		
		System.out.println("email1 = " +validateEmail(email1));
		System.out.println("email2 = " +validateEmail(email2));
	}
	
	public static String validateEmail(String email) {
		if(email == null || email.isEmpty()) {
			return "invalid";
		}

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + 
                "[a-zA-Z0-9_+&*-]+)*@" + 
				"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		
		Pattern pattern = Pattern.compile(emailRegex);
		if(pattern.matcher(email).matches()) {
			return "valid";
		}else {
			
			return "invalid";
		}
	}

	
	
	
	
}
