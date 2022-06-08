package by.koroza.programming_with_classes.composition.numberfour;

public class Sorting {

	public static BankAccount[] sortingByBalanceBankAccount(BankAccount[] bankAccounts) {
		BankAccount[] bankAccountsClone = bankAccounts.clone();
		for (int i = 0; i < bankAccountsClone.length; i++) {
			for (int j = i; j < bankAccountsClone.length; j++) {
				if (bankAccountsClone[i].getBalance() > bankAccountsClone[j].getBalance()) {
					transfer(i, j, bankAccountsClone);
				}
			}
		}
		return bankAccountsClone;
	}
	
	public static BankAccount[] sortingByNumberBankAccount(BankAccount[] bankAccounts) {
		BankAccount[] bankAccountsClone = bankAccounts.clone();
		
		return bankAccountsClone;
	}
	
	public static BankAccount[] sortingByNumberOperations(BankAccount[] bankAccounts) {
		BankAccount[] bankAccountsClone = bankAccounts.clone();
		
		return bankAccountsClone;
	}
	
	public static BankAccount[] sortingByStatus(BankAccount[] bankAccounts) {
		BankAccount[] bankAccountsClone = bankAccounts.clone();
		
		return bankAccountsClone;
	}

	private static void transfer(int i, int j, BankAccount[] bankAccountsClone) {
		BankAccount bankAccountBuffer = bankAccountsClone[i];
		bankAccountsClone[i] = bankAccountsClone[j];
		bankAccountsClone[j] = bankAccountBuffer;
	}
}