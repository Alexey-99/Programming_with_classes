/* Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

package by.koroza.programming_with_classes.composition.numberfour.main;

import by.koroza.programming_with_classes.composition.numberfour.BankAccount;
import by.koroza.programming_with_classes.composition.numberfour.Operation;
import by.koroza.programming_with_classes.composition.numberfour.Person;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Koroza", "Alexey", "M", new BankAccount());

		person.getBankAccounts()[0].addOperation(new Operation(-5.00, "operation"));
		person.addBankAccount(new BankAccount());

		BankAccount[] bankAccounts = { new BankAccount(), new BankAccount(), new BankAccount() };
		person.addBankAccounts(bankAccounts);
		
		person.getBankAccounts()[0].addOperation(new Operation(10, "Operation"));
		person.getBankAccounts()[3].setStatus("block");
		//person.searchBySum(1, 10);
		//person.searchByMinSum(0);
		//person.searchByMaxSum(10);
		//person.sortingByBalance();
		//person.sortingByNumber();
		//person.sortingByNumberOperations();
		//person.sortingByStatus();
	}
}