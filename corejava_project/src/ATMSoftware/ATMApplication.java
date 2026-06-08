package ATMSoftware;

import java.util.Scanner;

public class ATMApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMService atm = new ATMService();
		AdminService admin = new AdminService();
		while (true) {
			System.out.println("ATM SYSTEM ");
	        System.out.println("1. Create Account");
	        System.out.println("2. Account Login");
	        System.out.println("3. Admin Login");
	        System.out.println("4. Exit");
	        System.out.print("Choose Option: ");
	        int choice = sc.nextInt();
	        switch (choice) {
	        case 1:
	        	atm.createAccount(sc);
	        	break;
	        	case 2:
	        		System.out.print("Enter Account Number: ");
	        		long accNo = sc.nextLong();
	        		System.out.print("Enter PIN: ");
	        		int pin = sc.nextInt();
	        		Account account = atm.login(accNo, pin);
	        		if (account == null) {
	        			System.out.println("Invalid Credentials");
	        			} else {
	        				int ch;
	        				do {
	        					System.out.println("1.Withdraw");
	                            System.out.println("2.Deposit");
	                            System.out.println("3.Check Balance");
	                            System.out.println("4.Logout");
	                            System.out.print("Enter Choice: ");
	                            ch = sc.nextInt();
	                            switch (ch) {
	                            case 1:
	                            	atm.withdraw(account, sc);
	                            	break;
	                            	case 2:
	                            		atm.deposit(account, sc);
	                            		break;
	                            		case 3:
	                            			atm.checkBalance(account);
	                            			break;
	                            			case 4:
	                            				System.out.println("Logout Successful");
	                            				break;
	                            				default:
	                            					System.out.println("Invalid Choice");
	                            					}
	                            } while (ch != 4);
	        				}
	        		break;
	        		case 3:
	        			System.out.print("Enter Admin PIN: ");
	        			int adminPin = sc.nextInt();
	        			if (admin.adminLogin(adminPin)) {
	        				int adminChoice;
	        				do {
	        					System.out.println("1.View Accounts");
	                            System.out.println("2.Delete Account");
	                            System.out.println("3.Logout");

	                            System.out.print("Enter Choice: ");
	                            adminChoice = sc.nextInt();
	                            switch (adminChoice) {
	                            case 1:
	                            	admin.viewAccounts();
	                            	break;
	                            	case 2:
	                            		System.out.print("Enter Account Number: ");
	                            		long deleteAcc =sc.nextLong();
	                            		admin.deleteAccount(deleteAcc);
	                                    break;
	                                    case 3:
	                                    System.out.println("Admin Logout");
	                                    break;
	                                    default:
	                                    	System.out.println("Invalid Choice");
	                            }
	                            } while (adminChoice != 3);
	        				} else {
	        					System.out.println("Invalid Admin PIN");
	        				}
	        			break;
	        			case 4:
	        				System.out.println("Thank You");
	                        System.exit(0);
	                        default:
	                        	System.out.println("Invalid Choice");
	            }
	        }
	    }
	}


