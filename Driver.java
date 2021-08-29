package com.greatlearning.service;

import java.util.*;

import com.greatlearing.model.Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp =  new Employee("fNam", "lNam");
		CredentialService cs = new CredentialService();
		
		System.out.println("Please Enter the department number ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner in = new Scanner(System.in);
		int i;
		i = in.nextInt();
		switch(i) {
		case 1 : cs.showDetails(emp,cs.generateEmailAddress(emp, "tech"),cs.generatePassword() ); break;
		case 2 : cs.showDetails(emp, cs.generateEmailAddress(emp, "ad") , cs.generatePassword()); break;
		case 3 : cs.showDetails(emp, cs.generateEmailAddress(emp, "hr") , cs.generatePassword()); break;
		case 4 : cs.showDetails(emp,cs.generateEmailAddress(emp, "legal") , cs.generatePassword()); break;
		}
		
		in.close();
	}

}
