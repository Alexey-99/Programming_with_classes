package by.koroza.programming_with_classes.composition.numberfour.operations;

import by.koroza.programming_with_classes.composition.numberfour.main.BankAccount;

public class Search {
	private final static String NOT_FOUND_ACCOUNTS_WITH_BALANCE = "Not found accouts with balance range.";
	private final static String NOT_FOUND_ACCOUNTS_WITH_NUMBER = "Not found accouts with number range.";
	private final static String NOT_FOUND_ACCOUNTS_WITH_STATUS = "Not found accouts with status: ";

	public static void searchByMinToMaxBalance(double minBalance, double maxBalance, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() >= minBalance && account.getBalance() <= maxBalance) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_BALANCE);
		}
	}

	public static void searchByMinBalance(double minBalance, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() >= minBalance) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_BALANCE);
		}
	}

	public static void searchByMaxBalance(double maxBalance, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() <= maxBalance) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_BALANCE);
		}
	}

	public static void searchByBalance(double balance, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getBalance() == balance) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_BALANCE);
		}
	}

	public static void searchByMinToMaxNumber(int numberMin, int numberMax, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getNumber() >= numberMin && account.getNumber() <= numberMax) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_NUMBER);
		}
	}

	public static void searchByMinNumber(int numberMin, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getNumber() >= numberMin) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_NUMBER);
		}
	}

	public static void searchByMaxNumber(int numberMax, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getNumber() <= numberMax) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_NUMBER);
		}
	}

	public static void searchByNumber(int number, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getNumber() == number) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_NUMBER);
		}
	}

	public static void searchByStatus(String status, BankAccount[] bankAccounts) {
		boolean isSearch = false;
		for (BankAccount account : bankAccounts) {
			if (account.getStatus().equals(status)) {
				isSearch = true;
				System.out.println(account.toString());
			}
		}
		if (isSearch == false) {
			System.out.println(NOT_FOUND_ACCOUNTS_WITH_STATUS + status);
		}
	}
}