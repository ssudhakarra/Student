package ATMSoftware;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMService {
	static ArrayList<Account> accounts = new ArrayList<>();
	public void createAccount(Scanner sc) {
		System.out.print("Enter Username: ");
		String name = sc.next();
		System.out.print("Enter Location: ");
		String location = sc.next();
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter PIN: ");
		int pin = sc.nextInt();
		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();
		accounts.add(new Account(name, location, accNo, pin, balance));
		System.out.println("Account Created Successfully.");
		}
	public Account login(long accNo, int pin) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accNo && acc.getPin() == pin) {
				return acc;
				}
			}
		return null;
		}
	public void withdraw(Account acc, Scanner sc) {
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		if (amount % 100 != 0) {
			System.out.println("Amount must be multiple of 100");
			return;
			}
		if (amount > acc.getBalance()) {
			System.out.println("Insufficient Balance");
			return;
			}
		acc.setBalance(acc.getBalance() - amount);
		System.out.println("Withdrawal Successful");
		System.out.println("Current Balance: " +acc.getBalance());
		}
	public void deposit(Account acc, Scanner sc) {
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		if (amount % 100 != 0) {
			System.out.println("Amount must be multiple of 100");
			return;
			}
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Deposit Successful");
		System.out.println("Current Balance: " +acc.getBalance());
		}
	public void checkBalance(Account acc) {
		System.out.println("Current Balance: " +acc.getBalance());
		}
	}


