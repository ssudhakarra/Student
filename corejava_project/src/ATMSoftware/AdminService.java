package ATMSoftware;

public class AdminService {
	
	private final int ADMIN_PIN = 1234;
	public boolean adminLogin(int pin) {
		return pin == ADMIN_PIN;
		}
	public void viewAccounts() {
		if (ATMService.accounts.isEmpty()) {
			System.out.println("No Accounts Available");
			return;
			}
		for (Account acc : ATMService.accounts) {
			System.out.println(acc);
			}
		}
	public void deleteAccount(long accNo) {
		for (Account acc : ATMService.accounts) {
			if (acc.getAccountNumber() == accNo) {
				ATMService.accounts.remove(acc);
				System.out.println("Account Deleted");
				return;
				}
			}
		System.out.println("Account Not Found");
		}
	}


