package by.koroza.programming_with_classes.composition.numbertwo;

public class Engine {
	private double wear;
	private static double wearMax = 100;

	public Engine() {
		this.wear = 0;
	}

	public Engine(double wear) {
		this.wear = wear;
	}

	public double getWear() {
		return wear;
	}

	public void setWear(double wear) {
		this.wear = wear;
	}

	public static double getWearMax() {
		return wearMax;
	}

	public static void setWearMax(double wearMax) {
		Engine.wearMax = wearMax;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(wear);
		result = result * prime + Double.hashCode(wearMax);
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
		Engine engine = (Engine) object;
		if (wear != engine.wear) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Engine wear: ").append(false).append("%");
		return builder.toString();
	}

}