package by.koroza.programming_with_classes.composition.numberfour.operations;

import by.koroza.programming_with_classes.composition.numberfour.main.BankAccount;

public class CalculateSum {

	public static double sumByAllBankAccounts(BankAccount[] bankAccounts) {
		double sum = 0;
		for (BankAccount account : bankAccounts) {
			sum += account.getBalance();
		}
		return sum;
	}

	public static double sumByBankAccountsWithPositiveBalance(BankAccount[] bankAccounts) {
		double sum = 0;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() > 0) {
				sum += account.getBalance();
			}
		}
		return sum;
	}

	public static double sumByBankAccountsWithNegativeBalance(BankAccount[] bankAccounts) {
		double sum = 0;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() < 0) {
				sum += account.getBalance();
			}
		}
		return sum;
	}
}