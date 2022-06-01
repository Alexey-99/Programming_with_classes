/* Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

package by.koroza.programming_with_classes.composition.numberthree;

public class Main {

	public static void main(String[] args) {
		City[] minsk = {new City("Minsk")};
		
		Region[] regions = { new Region("Minsk"), new Region("Brest"), new Region("Grodno"), new Region("Vitebsk"),
				new Region("Mogilev"), new Region("Gomel") };
		State state = new State("USA", regions);
	}
}