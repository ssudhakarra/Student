package ATMSoftware;

public class Account {
	private String username;
	private String location;
	private long accountNumber;
	private int pin;
	private double balance;
	public Account(String username, String location, long accountNumber,
			int pin, double balance) {
		this.username = username;
		this.location = location;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
		}
	public String getUsername() {
		return username;
		}
	public String getLocation() {
		return location;
		}
	public long getAccountNumber() {
		return accountNumber;
		}
	public int getPin() {
		return pin;
		}
	public double getBalance() {
		return balance;
		}
	public void setBalance(double balance) {
		this.balance = balance;
		}
	public String toString() {
		return "Username: " + username +
				", Location: " + location +
				", Account No: " + accountNumber +
				", Balance: " + balance;
		}
	}

	

