package by.koroza.programming_with_classes.composition.numberthree;

public class Region {
	private String name;
	private District[] districts;

	public Region(String name) {
		this.name = name;
	}

	public Region(String name, District[] districts) {
		this.name = name;
		this.districts = districts;
	}

	public Region(String name, District district) {
		this.name = name;
		this.districts[0] = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	public void addDistrict(District district) {
		District[] districtsNew = null;
		if (districts == null) {
			this.districts[0] = district;
		} else {
			districtsNew = new District[districts.length + 1];
			for (int i = 0; i < districtsNew.length; i++) {
				if (i < districts.length) {
					districtsNew[i] = districts[i];
				} else if (i == districts.length) {
					districtsNew[i] = district;
				}
			}
		}
		this.districts = districtsNew;
	}

	public void addDistricts(District[] districts) {
		District[] districtsNew = null;
		if (districts == null) {
			this.districts = districts;
		} else {
			districtsNew = new District[this.districts.length + districts.length];
			for (int i = 0; i < districtsNew.length; i++) {
				if (i < this.districts.length) {
					districtsNew[i] = this.districts[i];
				} else if (i >= this.districts.length) {
					districtsNew[i] = districts[i];
				}
			}
		}
		this.districts = districtsNew;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (districts != null ? districts.hashCode() : 1);
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
		if (name == null) {
			if (region.name != null) {
				return false;
			}
		} else if (!name.equals(region.name)) {
			return false;
		}
		if (districts == null) {
			if (region.districts != null) {
				return false;
			}
		} else if (!districts.equals(region.districts)) {
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