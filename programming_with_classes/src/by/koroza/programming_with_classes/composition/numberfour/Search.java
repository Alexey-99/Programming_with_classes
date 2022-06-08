package by.koroza.programming_with_classes.composition.numberfour;

public class Search {

	public static void searchByMinToMaxSum(double minSum, double maxSum, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() >= minSum && account.getBalance() <= maxSum) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if(isSearch == false) {
			System.out.println("");
		}
	}

	public static void searchByMinSum(double minSum, BankAccount[] bankAccounts) {
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() >= minSum) {
				System.out.println(account.toString());
			}
		}
	}

	public static void searchByMaxSum(double maxSum, BankAccount[] bankAccounts) {
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() <= maxSum) {
				System.out.println(account.toString());
			}
		}
	}
	
	public static void searchBySum(double sum, BankAccount[] bankAccounts) {
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() == sum) {
				System.out.println(account.toString());
			}
		}
	}

	public static void searchByNumber(int numberMin, int numberMax, BankAccount[] bankAccounts) {
		for (BankAccount account : bankAccounts) {
			if (account.getNumber() >= numberMin && account.getNumber() <= numberMax) {
				System.out.println(account.toString());
			}
		}
	}
}