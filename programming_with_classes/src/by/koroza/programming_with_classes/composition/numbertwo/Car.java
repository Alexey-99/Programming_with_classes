package by.koroza.programming_with_classes.composition.numbertwo;

public class Car {
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;

	public Car(Wheel[] wheels, Engine engine) {
		this.wheels = wheels;
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (wheels != null ? wheels.hashCode() : 1);
		result = result * prime + (engine != null ? engine.hashCode() : 1);
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