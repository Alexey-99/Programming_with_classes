/* Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

package by.koroza.programming_with_classes.composition.numberthree;

public class Main {

	public static void main(String[] args) {
		District[] minskDistrict = { new District("Frunzensky"), new District("Central"), new District("Sovietsky"),
				new District("Pervomaisky"), new District("Partizansky"), new District("Zavodskoy"),
				new District("Leninsky"), new District("Oktyabrsky"), new District("Moskovsky") };
		City[] minsk = { new City("Minsk", minskDistrict, "center", true), new City("Borisov"), new City("Zhodino"),
				new City("Slutsk"), new City("Soligorsk") };
		City[] brest = { new City("Brest", "center"), new City("Baranovichi"), new City("Pinsk") };
		City[] grodno = { new City("Grodno", "center"), new City("Lida") };
		City[] vitebsk = { new City("Vitebsk", "center"), new City("Novopolotsk"), new City("Orsha"),
				new City("Polotsk") };
		City[] mogilev = { new City("Mogilev", "center"), new City("Bobruisk") };
		City[] gomel = { new City("Gomel", "center"), new City("Zhlobin"), new City("Mozyr"), new City("Rechitsa"),
				new City("Svetlogorsk") };
		Region[] regions = { new Region("Minsk", minsk), new Region("Brest", brest), new Region("Grodno", grodno),
				new Region("Vitebsk", vitebsk), new Region("Mogilev", mogilev), new Region("Gomel", gomel) };
		State state = new State("Belarus", regions, 123456);
		//System.out.println(state.toString());
		state.printCapitalState();
		state.printNumberRegions();
		state.printArea();
	}
}