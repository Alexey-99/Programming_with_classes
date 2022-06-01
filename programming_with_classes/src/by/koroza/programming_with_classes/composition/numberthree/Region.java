package by.koroza.programming_with_classes.composition.numberthree;

public class Region {
	private String name;
	private District[] district;

	public Region() {

	}

	public Region(String name) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District[] getDistrict() {
		return district;
	}

	public void setDistrict(District[] district) {
		this.district = district;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime;
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
		Region region = (Region) object;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}

}