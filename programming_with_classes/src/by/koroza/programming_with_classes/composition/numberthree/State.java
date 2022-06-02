package by.koroza.programming_with_classes.composition.numberthree;

public class State {
	private String name;
	private Region[] regions;
	private double area;
	private final static String STATE_NAME = "State name: ";
	private final static String REGIONS_LIST = "Regions:";
	private final static String STATE_DOES_NOT_HAVE_REGIONS = "This state doesn't have regions.";
	private final static String CITY = "City ";
	private final static String IS_CAPITAL_STATE = " is capital state.";
	private final static String STATE_DOES_NOT_HAVE_REGIONS_AND_CITIES = "This state doesn't have regions and cities.";
	private final static String STATE_AREA = "State area: ";
	private final static String STATE_HAS = "State has ";
	private final static String REGIONS = " regions.";

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

	public void printCapitalState() {
		if (regions != null) {
			for (Region region : regions) {
				City[] cities = region.getCities();
				for (City city : cities) {
					if (city.getIsStateCapital() == true) {
						System.out.println(CITY + city.getName() + IS_CAPITAL_STATE);
					}
				}
			}
		} else {
			System.out.println(STATE_DOES_NOT_HAVE_REGIONS_AND_CITIES);
		}
	}

	public void printNumberRegions() {
		if (regions != null) {
			System.out.println(STATE_HAS + regions.length + REGIONS);
		} else {
			System.out.println(STATE_DOES_NOT_HAVE_REGIONS);
		}
	}

	public void printArea() {
		System.out.println(STATE_AREA + area);
	}

	public void printRegionCenter() {
		StringBuilder builder = new StringBuilder();
		int countRegionsCenter = 0;
		if (regions != null) {
			for (Region region : regions) {
				City[] cities = region.getCities();
				for (City city : cities) {
					if (city.getCityStatus() != null) {
						if (city.getCityStatus().equals("center")) {
							builder.append(++countRegionsCenter).append(")");
							builder.append(" Region ").append(region.getName()).append(" has ");
							builder.append("city region center ").append(city.getName()).append(";").append("\n");
						}
					}
				}
			}
		} else {
			builder.append("This state doesn't have regions.");
		}
		System.out.println(builder.toString());
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (name != null ? name.hashCode() : 1);
		result = result * prime + (regions != null ? regions.hashCode() : 1);
		result = result * prime + Double.hashCode(area);
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
		if (area != state.area) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(STATE_NAME).append(name).append("\n");
		if (regions != null) {
			builder.append(REGIONS_LIST).append("\n");
			for (int i = 0; i < regions.length; i++) {
				builder.append(i + 1).append(") ").append(regions[i].toString()).append("\n");
			}
		} else {
			builder.append(STATE_DOES_NOT_HAVE_REGIONS).append("\n");
		}
		builder.append(STATE_AREA).append(area);
		return builder.toString();
	}
}