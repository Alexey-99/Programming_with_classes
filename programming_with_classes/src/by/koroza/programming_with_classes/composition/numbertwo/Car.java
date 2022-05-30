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
		this.id = count++;
		this.wheels[0] = wheelsOne;
		this.wheels[1] = wheelsTwo;
		this.wheels[2] = wheelsThree;
		this.wheels[3] = wheelsFour;
		this.engine = engine;
		this.fuelTank = fuelTank;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public void setWheels(Wheel wheelsOne, Wheel wheelsTwo, Wheel wheelsThree, Wheel wheelsFour) {
		this.wheels[0] = wheelsOne;
		this.wheels[1] = wheelsTwo;
		this.wheels[2] = wheelsThree;
		this.wheels[3] = wheelsFour;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public FuelTank getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(FuelTank fuelTank) {
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
		if (fuelTank == null) {
			if (car.fuelTank != null) {
				return false;
			}
		} else if (!fuelTank.equals(car.fuelTank)) {
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