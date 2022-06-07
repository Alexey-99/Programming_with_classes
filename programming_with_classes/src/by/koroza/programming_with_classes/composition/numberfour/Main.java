/* Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

package by.koroza.programming_with_classes.composition.numberfour;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Koroza", "Alexey", "M", new BankAccount());
		
		person.getBankAccounts()[0].addOperation(new Operation(5.00, "operation"));
		System.out.println(person.getBankAccounts()[0].getOperations()[0].getDate());
	}
}