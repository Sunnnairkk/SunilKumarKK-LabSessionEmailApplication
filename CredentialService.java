package com.greatlearning.service;

import java.util.*;
import com.greatlearing.model.*;

public class CredentialService {

	public char[] generatePassword() {
		String capsL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallL = "abcdefghijklmnopqrstuvwxyz";
		String numb = "0123456789";
		String spl = "!@#$%^&*()-+";
		
		String finalString = capsL+smallL+numb+spl;
	
		Random r = new Random(74);
	
		char[] pwd = new char[8];
	
		for(int j=0; j<8; j++) {
			pwd[j] = finalString.charAt(r.nextInt(finalString.length()));
		}
		
		return pwd;
	}
	
	public String generateEmailAddress(Employee emp, String department) {
		return emp.getFirstName().toLowerCase() + "." + emp.getLastName().toLowerCase() + "@" + department + ".abc.com";
		
	}
	
	public void showDetails(Employee emp, String email, char[] pwd) {
		System.out.println("Dear " + emp.getFirstName() + ", your details are as follows :"   );
		System.out.println("Email -->" + email );
		System.out.println("Password -->" + pwd.toString());
	}
	
}
