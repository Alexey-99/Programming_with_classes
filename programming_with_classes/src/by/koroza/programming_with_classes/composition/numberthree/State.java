package by.koroza.programming_with_classes.composition.numberthree;

public class State {
	private String name;
	private Region[] regions;
	private double area;

	public State(String name, double area) {
		this.name = name;
		this.area = area;
	}

	public State(String name, Region[] regions, double area) {
		this.name = name;
		this.regions = regions;
		this.area = area;
	}

	public State(String name, Region region, double area) {
		this.name = name;
		this.regions[0] = region;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void addRegion(Region region) {
		Region[] regionsNew = null;
		if (regions == null) {
			this.regions[0] = region;
		} else {
			regionsNew = new Region[regions.length + 1];
			for (int i = 0; i < regionsNew.length; i++) {
				if (i < regions.length) {
					regionsNew[i] = regions[i];
				} else if (i == regions.length) {
					regionsNew[i] = region;
				}
			}
		}
		this.regions = regionsNew;
	}

	public void addRegions(Region[] regions) {
		Region[] regionsNew = null;
		if (regions == null) {
			this.regions = regions;
		} else {
			regionsNew = new Region[this.regions.length + regions.length];
			for (int i = 0; i < regionsNew.length; i++) {
				if (i < this.regions.length) {
					regionsNew[i] = this.regions[i];
				} else if (i >= this.regions.length) {
					regionsNew[i] = regions[i];
				}
			}
		}
		this.regions = regionsNew;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (regions != null ? regions.hashCode() : 1);
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
		State state = (State) object;
		if (name == null) {
			if (state.name != null) {
				return false;
			}
		} else if (!name.equals(state.name)) {
			return false;
		}
		if (regions == null) {
			if (state.regions != null) {
				return false;
			}
		} else if (!regions.equals(state.regions)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(false);
		return builder.toString();
	}
}