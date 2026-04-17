package Pack1;

import java.util.Scanner;


public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to SBI Bank...");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter ur pin...");
		int pin=sc.nextInt();
		System.out.println("pin is:"+pin);
		System.out.println("Please enter your acc_num");
		long acc_num =sc.nextLong();
		System.out.println("Please enter your balance");
		double balance=sc.nextDouble();
		System.out.println("Please enter your name");
		String name=sc.next();
		System.out.println("Thank you");
		System.out.println("Please visit again...");
		
		
		
		

	}

}
