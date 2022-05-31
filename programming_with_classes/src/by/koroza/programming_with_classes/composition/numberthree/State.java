package by.koroza.programming_with_classes.composition.numberthree;

public class State {
	private String name;
	private Region[] regions;

	public State(String name) {
		this.name = name;
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
		return builder.toString();
	}
}