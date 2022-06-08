package by.koroza.programming_with_classes.composition.numberfour.operations;

import by.koroza.programming_with_classes.composition.numberfour.main.BankAccount;

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
		for (int i = 0; i < bankAccountsClone.length; i++) {
			for (int j = i; j < bankAccountsClone.length; j++) {
				if (bankAccountsClone[i].getNumber() > bankAccountsClone[j].getNumber()) {
					transfer(i, j, bankAccountsClone);
				}
			}
		}
		return bankAccountsClone;
	}

	public static BankAccount[] sortingByNumberOperations(BankAccount[] bankAccounts) {
		BankAccount[] bankAccountsClone = bankAccounts.clone();
		int lengthI = 0;
		int lengthJ = 0;
		for (int i = 0; i < bankAccountsClone.length; i++) {
			for (int j = i; j < bankAccountsClone.length; j++) {
				if (bankAccountsClone[i].getOperations()[0] != null) {
					lengthI = bankAccountsClone[i].getOperations().length;
				} else {
					lengthI = 0;
				}
				if (bankAccountsClone[j].getOperations()[0] != null) {
					lengthJ = bankAccountsClone[i].getOperations().length;
				} else {
					lengthJ = 0;
				}
				if (lengthI < lengthJ) {
					transfer(i, j, bankAccountsClone);
				}
			}
		}
		return bankAccountsClone;
	}

	public static BankAccount[] sortingByStatus(BankAccount[] bankAccounts) {
		BankAccount[] bankAccountsClone = bankAccounts.clone();
		int compare = 0;
		for (int i = 0; i < bankAccountsClone.length; i++) {
			for (int j = i; j < bankAccountsClone.length; j++) {
				compare = bankAccountsClone[i].getStatus().compareTo(bankAccountsClone[j].getStatus());
				if (compare > 0) {
					transfer(i, j, bankAccountsClone);
				}
			}
		}
		return bankAccountsClone;
	}

	private static void transfer(int i, int j, BankAccount[] bankAccountsClone) {
		BankAccount bankAccountBuffer = bankAccountsClone[i];
		bankAccountsClone[i] = bankAccountsClone[j];
		bankAccountsClone[j] = bankAccountBuffer;
	}
}