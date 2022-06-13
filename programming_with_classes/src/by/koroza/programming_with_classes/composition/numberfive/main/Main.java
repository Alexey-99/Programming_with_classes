/* Туристические путевки. 
 * Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. 
 * Реализовать выбор и сортировку путевок. 
 */

package by.koroza.programming_with_classes.composition.numberfive.main;

import by.koroza.programming_with_classes.composition.numberfive.entity.TravelCampany;
import by.koroza.programming_with_classes.composition.numberfive.entity.TravelVoucher;
import by.koroza.programming_with_classes.composition.numberfive.programprocess.ProgramProcess;

public class Main {

	public static void main(String[] args) {
		TravelVoucher[] travelVouchers = { new TravelVoucher("Turkey", "Alanya", "beach tour", 11, 865),
				new TravelVoucher("Egypt", "Sharm El Sheikh", "beach tour", 11, 880),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 130),
				new TravelVoucher("Italy", "San Marino", "sea + excursion tour", 10, 330,
						"Italian holidays without night crossings 3 places for tourists with visas (Italy, Austria, Czech Republic)"),
				new TravelVoucher("Belarus", "children's rest", 14, 374,
						"Children's health resort NAROCHKIDS in Naroch resort"),
				new TravelVoucher("Georgia", "Tbilisi", "sea + excursion tour", 15, 210),
				new TravelVoucher("Georgia", "Kobuleti", "sea + excursion tour", 15, 290,
						"To Georgia by sea - Kobuleti"),
				new TravelVoucher("Hungary", "Slovakia", "excursion tour", 4, 179,
						"Hungary is a thermal paradise! For tourists with a Visa!"),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 95,
						"White Nights and Bright Weekends in St. Petersburg! All 4 excursions are already included in the tour price "),
				new TravelVoucher("Turkey", "Istanbul", "excursion tour", 7, 610,
						"Istanbul with departure from Minsk!"),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 95,
						"Bright weekend in St. Petersburg! All 4 excursions are already included in the tour price"),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 3, 85,
						"Myths and legends of St. Petersburg (2 days)"),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 135,
						"St. Petersburg-Peterhof-Kronstadt-Tsarskoye Selo"),
				new TravelVoucher("Russia", "excursion tour", 4, 105, "gold ring of Russia "),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 100,
						"Petersburg + Karelia! Karelia Free!!! No hidden extras! All sightseeing tours are included"),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 95,
						"Bright weekend in St. Petersburg! All 4 excursions are already included in the tour price "),
				new TravelVoucher("Russia", "St. Petersburg", "excursion tour", 4, 100,
						"Petersburg + Karelia! Karelia Free!!! No hidden extras! All sightseeing tours are included"),
				new TravelVoucher("Turkey", "Istanbul", "excursion tour", 5, 545,
						"Avia. Spring in Istanbul. Tours you choose"),
				new TravelVoucher("Russia", "Moskow", "excursion tour", 4, 105, "Bus tour " + "'Moscow of many faces'"),
				new TravelVoucher("Turkey", "Kemer", "beach tour", 11, 1035, "Tour to Larissa Sultan`s Beach Hotel") };
		TravelCampany campany = new TravelCampany("AlexKor", travelVouchers);
		ProgramProcess.process(campany);
	}
}