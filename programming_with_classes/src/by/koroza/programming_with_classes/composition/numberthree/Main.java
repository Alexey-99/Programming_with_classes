/* Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

package by.koroza.programming_with_classes.composition.numberthree;

public class Main {
	final static String DISTRICT_FRUNZENSKY = "Frunzensky";
	final static String DISTRICT_CENTRAL = "Central";
	final static String DISTRICT_SOVIETSKY = "Sovietsky";
	final static String DISTRICT_PERVOMAISKY = "Pervomaisky";
	final static String DISTRICT_PARTIZANSKY = "Partizansky";
	final static String DISTRICT_ZAVODSKOY = "Zavodskoy";
	final static String DISTRICT_LENINSKY = "Leninsky";
	final static String DISTRICT_OKTYABRSKY = "Oktyabrsky";
	final static String DISTRICT_MOSKOVSRY = "Moskovsky";

	final static String CITY_MINSK = "Minsk";
	final static String CITY_BORISOV = "Borisov";
	final static String CITY_ZHODINO = "Zhodino";
	final static String CITY_SLUTSK = "Slutsk";
	final static String CITY_SOLIGORSK = "Soligorsk";

	final static String CITY_BREST = "Brest";
	final static String CITY_BARANOVICHI = "Baranovichi";
	final static String CITY_PINSK = "Pinsk";

	final static String CITY_GRODNO = "Grodno";
	final static String CITY_LIDA = "Lida";

	final static String CITY_VITEBSK = "Vitebsk";
	final static String CITY_NOVOPOLOTSK = "Novopolotsk";
	final static String CITY_ORSHA = "Orsha";
	final static String CITY_POLOTSK = "Polotsk";

	final static String CITY_MOGILEV = "Mogilev";
	final static String CITY_BOBRUISK = "Bobruisk";
	
	
	final static String CITY_STATUS = "center";
	final static boolean STATE_CAPITAL = true;

	public static void main(String[] args) {
		District[] minskDistrict = { new District(DISTRICT_FRUNZENSKY), new District(DISTRICT_CENTRAL),
				new District(DISTRICT_SOVIETSKY), new District(DISTRICT_PERVOMAISKY),
				new District(DISTRICT_PARTIZANSKY), new District(DISTRICT_ZAVODSKOY), new District(DISTRICT_LENINSKY),
				new District(DISTRICT_OKTYABRSKY), new District(DISTRICT_MOSKOVSRY) };
		City[] minsk = { new City(CITY_MINSK, minskDistrict, CITY_STATUS, STATE_CAPITAL), new City(CITY_BORISOV),
				new City(CITY_ZHODINO), new City(CITY_SLUTSK), new City(CITY_SOLIGORSK) };

		City[] brest = { new City(CITY_BREST, CITY_STATUS), new City(CITY_BARANOVICHI), new City(CITY_PINSK) };
		City[] grodno = { new City(CITY_GRODNO, CITY_STATUS), new City(CITY_LIDA) };
		City[] vitebsk = { new City(CITY_VITEBSK, CITY_STATUS), new City(CITY_NOVOPOLOTSK), new City(CITY_ORSHA),
				new City(CITY_POLOTSK) };
		City[] mogilev = { new City(CITY_MOGILEV, CITY_STATUS), new City(CITY_BOBRUISK) };
		City[] gomel = { new City("Gomel", CITY_STATUS), new City("Zhlobin"), new City("Mozyr"), new City("Rechitsa"),
				new City("Svetlogorsk") };
		Region[] regions = { new Region("Minsk", minsk), new Region("Brest", brest), new Region("Grodno", grodno),
				new Region("Vitebsk", vitebsk), new Region("Mogilev", mogilev), new Region("Gomel", gomel) };
		State state = new State("Belarus", regions, 123456);

		state.printCapitalState();
		state.printNumberRegions();
		state.printArea();
		state.printRegionCenter();
	}
}