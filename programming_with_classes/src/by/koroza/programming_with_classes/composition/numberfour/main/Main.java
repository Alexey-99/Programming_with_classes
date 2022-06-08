/* Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

package by.koroza.programming_with_classes.composition.numberfour.main;

public class Main {
	static final String SEARCH_BANK_ACCOUNTS_WITH_BALANCE_RANGE = "Search for bank accounts with a balance in the range:";
	static final String SEARCH_BANK_ACCOUNTS_WITH_SUM_BALANCE = "Search for bank accounts with sum balance:";
	static final String SEARCH_BANK_ACCOUNTS_WITH_NUMBER_BANK_ACCOUNT_RANGE = "Search for bank accounts with a number bank account in the range:";
	static final String SEARCH_BANK_ACCOUNTS_WITH_NUMBER_BANK_ACCOUNT = "Search for bank accounts with number bank account:";
	static final String SEARCH_BANK_ACCOUNTS_WITH_STATUS_BANK_ACCOUNT = "Search for bank accounts with staus bank account:";

	public static void main(String[] args) {
		Person person = new Person("Koroza", "Alexey", "M", new BankAccount());

		person.getBankAccounts()[0].addOperation(new Operation(-5.00, "operation"));
		person.addBankAccount(new BankAccount());

		BankAccount[] bankAccounts = { new BankAccount(), new BankAccount(), new BankAccount() };
		person.addBankAccounts(bankAccounts);

		person.getBankAccounts()[0].addOperation(new Operation(10, "Operation"));
		person.getBankAccounts()[3].setStatus("block");

		search(person);
		sorting(person);
		calculationSum(person);

	}

	private static void search(Person person) {
		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_BALANCE_RANGE);
		person.searchByMinToMaxBalance(1, 10);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_BALANCE_RANGE);
		person.searchByMinBalance(0);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_BALANCE_RANGE);
		person.searchByMaxBalance(10);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_SUM_BALANCE);
		person.searchByBalance(0);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_NUMBER_BANK_ACCOUNT_RANGE);
		person.searchByMinToMaxNumber(1, 3);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_NUMBER_BANK_ACCOUNT_RANGE);
		person.searchByMinNumber(3);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_NUMBER_BANK_ACCOUNT_RANGE);
		person.searchByMaxNumber(5);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_NUMBER_BANK_ACCOUNT);
		person.searchByNumber(1);

		System.out.println("\n" + SEARCH_BANK_ACCOUNTS_WITH_STATUS_BANK_ACCOUNT);
		person.searchByStatus("active");
	}

	private static void sorting(Person person) {
		System.out.println("\n" + "Sorting by balance bank accounts:");
		person.printArrayBankAccount(person.sortingByBalance());

		System.out.println("\n" + "Sorting by number bank accounts:");
		person.printArrayBankAccount(person.sortingByNumber());

		System.out.println("\n" + "Sorting by number operations bank accounts:");
		person.printArrayBankAccount(person.sortingByNumberOperations());

		System.out.println("\n" + "Sorting by status bank accounts:");
		person.printArrayBankAccount(person.sortingByStatus());
	}

	private static void calculationSum(Person person) {
		System.out.println("The sum of all accounts: " + person.sumByAllBankAccounts());
		System.out.println(
				"The sum of all accounts with a positive balance: " + person.sumByBankAccountsWithPositiveBalance());
		System.out.println(
				"The sum of all accounts with a negative balance: " + person.sumByBankAccountsWithNegativeBalance());
	}
}