/* Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

package by.koroza.programming_with_classes.composition.numberfour.main;

public class Main {

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
		System.out.println("\n" + "Search for bank accounts with a balance in the range:");
		person.searchByMinToMaxBalance(1, 10);

		System.out.println("\n" + "Search for bank accounts with a balance in the range:");
		person.searchByMinBalance(0);

		System.out.println("\n" + "Search for bank accounts with a balance in the range:");
		person.searchByMaxBalance(10);

		System.out.println("\n" + "Search for bank accounts with sum balance:");
		person.searchByBalance(0);

		System.out.println("\n" + "Search for bank accounts with a number bank account in the range:");
		person.searchByMinToMaxNumber(1, 3);

		System.out.println("\n" + "Search for bank accounts with a number bank account in the range:");
		person.searchByMinNumber(3);

		System.out.println("\n" + "Search for bank accounts with a number bank account in the range:");
		person.searchByMaxNumber(5);

		System.out.println("\n" + "Search for bank accounts with number bank account:");
		person.searchByNumber(1);

		System.out.println("\n" + "Search for bank accounts with staus bank account:");
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