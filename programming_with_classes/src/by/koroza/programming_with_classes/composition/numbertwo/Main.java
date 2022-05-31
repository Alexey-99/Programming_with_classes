/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 
 */

package by.koroza.programming_with_classes.composition.numbertwo;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("M", new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Engine(), new FuelTank());
		car.goByCar(50);
		System.out.println(car.toString());
		car.goByCar();
	}
}