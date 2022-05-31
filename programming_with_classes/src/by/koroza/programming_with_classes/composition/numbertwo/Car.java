package by.koroza.programming_with_classes.composition.numbertwo;

import static by.koroza.programming_with_classes.composition.numbertwo.Wheel.getWearMax;

public class Car {
	private static int count = 1;

	private int id;
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;
	private FuelTank fuelTank;
	private String model;
	private final static String CAR_MODEL = "Car model: ";
	private final static String RAN_OUT_OF_FUEL = "Ran out of fuel.";
	private final static String WORN_OUT_WHEEL = "Worn out wheel with id ";
	private final static String WORN_OUT_ENGINE = "Worn out engine.";
	private final static String LEFT_TO_DRIVE = " kilometers left to drive";
	private final static String CAR_FILLED = "The car is filled.";

	public Car(String model, Wheel[] wheels, Engine engine, FuelTank fuelTank) {
		this.id = count++;
		this.wheels = wheels;
		this.engine = engine;
		this.fuelTank = fuelTank;
		this.model = model;
	}

	public Car(String model, Wheel wheelsOne, Wheel wheelsTwo, Wheel wheelsThree, Wheel wheelsFour, Engine engine,
			FuelTank fuelTank) {
		this.id = count++;
		this.wheels[0] = wheelsOne;
		this.wheels[1] = wheelsTwo;
		this.wheels[2] = wheelsThree;
		this.wheels[3] = wheelsFour;
		this.engine = engine;
		this.fuelTank = fuelTank;
		this.model = model;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void goByCar() {
		boolean flag = true;
		while (flag == true) {
			if ((fuelTank.getFuelBalance() > FuelTank.getFuelBalanceMin()) && (wheels[0].getWear() < getWearMax())
					&& (wheels[1].getWear() < getWearMax()) && (wheels[2].getWear() < getWearMax())
					&& (wheels[3].getWear() < getWearMax()) && (engine.getWear() < Engine.getWearMax())) {
				fuelTank.fuelConsumption();
				for (Wheel wheel : wheels) {
					wheel.wearIncrease();
				}
				engine.wearIncrease();
			} else {
				flag = false;
				if (fuelTank.getFuelBalance() > FuelTank.getFuelBalanceMin()) {
					System.out.println(RAN_OUT_OF_FUEL);
				}
				if (wheels[0].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[0].getID());
				}
				if (wheels[1].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[1].getID());
				}
				if (wheels[2].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[2].getID());
				}
				if (wheels[3].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[3].getID());
				}
				if (engine.getWear() < Engine.getWearMax()) {
					System.out.println(WORN_OUT_ENGINE);
				}
			}
		}
	}

	public void goByCar(double numberKM) {
		boolean flag = true;
		int countKM = 0;
		while (flag == true && countKM <= numberKM) {
			if ((fuelTank.getFuelBalance() > FuelTank.getFuelBalanceMin()) && (wheels[0].getWear() < getWearMax())
					&& (wheels[1].getWear() < getWearMax()) && (wheels[2].getWear() < getWearMax())
					&& (wheels[3].getWear() < getWearMax()) && (engine.getWear() < Engine.getWearMax())) {
				fuelTank.fuelConsumption();
				for (Wheel wheel : wheels) {
					wheel.wearIncrease();
				}
				engine.wearIncrease();
				countKM++;
			} else {
				flag = false;
				if (fuelTank.getFuelBalance() > FuelTank.getFuelBalanceMin()) {
					System.out.println(RAN_OUT_OF_FUEL);
				}
				if (wheels[0].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[0].getID());
				}
				if (wheels[1].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[1].getID());
				}
				if (wheels[2].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[2].getID());
				}
				if (wheels[3].getWear() < getWearMax()) {
					System.out.println(WORN_OUT_WHEEL + wheels[3].getID());
				}
				if (engine.getWear() < Engine.getWearMax()) {
					System.out.println(WORN_OUT_ENGINE);
				}
				double remainder = numberKM - countKM;
				if (remainder != 0) {
					System.out.println(remainder + LEFT_TO_DRIVE);
				}
			}
		}
	}

	public void refuel() {
		fuelTank.refuel();
		System.out.println(CAR_FILLED);
	}

	public void changeWheel(int id, Wheel wheel) {
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].getID() == id) {
				wheels[i] = wheel;
			}
		}
	}

	public void printModel() {
		System.out.println(CAR_MODEL + model);
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
		result = result * prime + (model != null ? model.hashCode() : 1);
		result = result * prime + (CAR_MODEL != null ? CAR_MODEL.hashCode() : 1);
		result = result * prime + (RAN_OUT_OF_FUEL != null ? RAN_OUT_OF_FUEL.hashCode() : 1);
		result = result * prime + (WORN_OUT_WHEEL != null ? WORN_OUT_WHEEL.hashCode() : 1);
		result = result * prime + (WORN_OUT_ENGINE != null ? WORN_OUT_ENGINE.hashCode() : 1);
		result = result * prime + (LEFT_TO_DRIVE != null ? LEFT_TO_DRIVE.hashCode() : 1);
		result = result * prime + (CAR_FILLED != null ? CAR_FILLED.hashCode() : 1);
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
		if (model == null) {
			if (car.model != null) {
				return false;
			}
		} else if (!model.equals(car.model)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ").append(id).append("\n");
		builder.append("Model: ").append(model).append("\n");
		for (Wheel wheel : wheels) {
			builder.append(wheel.toString()).append("\n");
		}
		builder.append(engine.toString()).append("\n");
		builder.append(fuelTank.toString()).append("\n");
		return builder.toString();
	}
}