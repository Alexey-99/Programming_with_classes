/* Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

package by.koroza.programming_with_classes.composition.numberfour;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Koroza", "Alexey", "M", new BankAccount());
	}
}