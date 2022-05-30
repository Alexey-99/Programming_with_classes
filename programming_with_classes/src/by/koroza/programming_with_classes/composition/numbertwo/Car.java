package by.koroza.programming_with_classes.composition.numbertwo;

public class Car {
	private static int count = 1;

	private int id;
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;
	private FuelTank fuelTank;

	public Car(Wheel[] wheels, Engine engine, FuelTank fuelTank) {
		this.id = count++;
		this.wheels = wheels;
		this.engine = engine;
		this.fuelTank = fuelTank;
	}

	public Car(Wheel wheelsOne, Wheel wheelsTwo, Wheel wheelsThree, Wheel wheelsFour, Engine engine,
			FuelTank fuelTank) {
		this.wheels[0] = wheelsOne;
		this.wheels[1] = wheelsTwo;
		this.wheels[2] = wheelsThree;
		this.wheels[3] = wheelsFour;
		this.engine = engine;
		this.id = count++;
		this.fuelTank = fuelTank;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (wheels != null ? wheels.hashCode() : 1);
		result = result * prime + (engine != null ? engine.hashCode() : 1);
		result = result * prime + (fuelTank != null ? fuelTank.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Car car = (Car) object;
		if (id != car.id) {
			return false;
		}
		if (wheels == null) {
			if (car.wheels != null) {
				return false;
			}
		} else if (!wheels.equals(car.wheels)) {
			return false;
		}
		if (engine == null) {
			if (car.engine != null) {
				return false;
			}
		} else if (!engine.equals(car.engine)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}
}