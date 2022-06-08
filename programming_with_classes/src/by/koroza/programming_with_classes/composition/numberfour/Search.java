package by.koroza.programming_with_classes.composition.numberfour;

public class Search {
	
	public static void searchBySum(double min, double max, BankAccount[] bankAccounts) { 
		for(BankAccount account : bankAccounts) {
			if(account.getBalance() >= min && account.getBalance() <= max) {
				System.out.println(account.toString());
			}
		}
	}
	
	public static void searchByMinSum(double min, BankAccount[] bankAccounts) { 
		for(BankAccount account : bankAccounts) {
			if(account.getBalance() >= min) {
				System.out.println(account.toString());
			}
		}
	}
	
	public static void searchByMaxSum(double max, BankAccount[] bankAccounts) {
		for(BankAccount account : bankAccounts) {
			if(account.getBalance() <= max) {
				System.out.println(account.toString());
			}
		}
	}
}