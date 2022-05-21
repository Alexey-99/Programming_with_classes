package by.koroza.programming_with_classes.classes.numbereight;

public class CostomerAggregating {
	private Costomer[] costomers;

	public CostomerAggregating() {

	}

	public CostomerAggregating(Costomer[] costomers) {
		this.costomers = costomers;
	}

	public Costomer[] getCostomers() {
		return costomers;
	}

	public void setCostomers(Costomer[] costomers) {
		this.costomers = costomers;
	}

	public void addCostomer(Costomer costomer) {
		Costomer[] costomersNew = new Costomer[costomers.length + 1];
		for (int i = 0; i < costomersNew.length; i++) {
			if (i < costomers.length) {
				costomersNew[i] = costomers[i];
			} else if (i == costomers.length) {
				costomersNew[i] = costomer;
			}
		}
		this.costomers = costomersNew;
	}

	public void addCostomers(Costomer[] costomers) {
		Costomer[] costomersNew = new Costomer[this.costomers.length + costomers.length];
		for (int i = 0; i < costomersNew.length; i++) {
			if (i < this.costomers.length) {
				costomersNew[i] = this.costomers[i];
			} else if (i >= costomers.length) {
				costomersNew[i] = costomers[i - this.costomers.length];
			}
		}
		this.costomers = costomersNew;
	}

	public void sortByAlphabeticalOrder() {
		int compare;
		Costomer buffer;
		for (int i = 0; i < costomers.length; i++) {
			for (int j = i; j < costomers.length; j++) {
				compare = costomers[i].getLastName().compareTo(costomers[i].getLastName());
				if (compare > 0) {
					buffer = costomers[i];
					costomers[i] = costomers[j];
					costomers[j] = buffer;
				}
			}
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (costomers != null ? costomers.hashCode() : 1);
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
		CostomerAggregating aggregating = (CostomerAggregating) object;
		if (costomers == null) {
			if (aggregating.costomers != null) {
				return false;
			}
		} else if (!costomers.equals(aggregating.costomers)) {
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