package by.koroza.programming_with_classes.classes.numbereight;

public class CostomerAggregating {
	private Costomer[] costomers;
	private static final String NO_MATCHES_FOUND_THIS_QUERY = "No matches were found for this query.";

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
		Costomer[] costomersNew = null;
		if (this.costomers == null) {
			costomersNew = new Costomer[1];
			costomersNew[0] = costomer;
		} else {
			costomersNew = new Costomer[costomers.length + 1];
			for (int i = 0; i < costomersNew.length; i++) {
				if (i < costomers.length) {
					costomersNew[i] = costomers[i];
				} else if (i == costomers.length) {
					costomersNew[i] = costomer;
				}
			}
		}
		this.costomers = costomersNew;
	}

	public void addCostomers(Costomer[] costomers) {
		Costomer[] costomersNew = null;
		if (this.costomers == null) {
			this.costomers = costomers;
		} else {
			costomersNew = new Costomer[this.costomers.length + costomers.length];
			for (int i = 0; i < costomersNew.length; i++) {
				if (i < this.costomers.length) {
					costomersNew[i] = this.costomers[i];
				} else if (i >= this.costomers.length) {
					costomersNew[i] = costomers[i - this.costomers.length];
				}
			}
			this.costomers = costomersNew;
		}
	}

	public void printCostomersByAlphabeticalOrder() {
		Costomer[] costomersSort = sortByAlphabeticalOrderByName();
		printCostomers(costomersSort);
	}

	public void printCreditCardNumberInDiapason(int min, int max) {
		int countReapitions = 0;
		for (int i = 0; i < costomers.length; i++) {
			if (costomers[i].getCreditCardNumber() >= min && costomers[i].getCreditCardNumber() <= max) {
				System.out.print(costomers[i].toString());
				countReapitions++;
			}
		}
		if (countReapitions == 0) {
			System.out.println(NO_MATCHES_FOUND_THIS_QUERY);
		}
	}

	private Costomer[] sortByAlphabeticalOrderByName() {
		int compare;
		Costomer[] costomersCopy = costomers.clone();
		for (int i = 0; i < costomersCopy.length; i++) {
			for (int j = i; j < costomersCopy.length; j++) {
				compare = costomersCopy[i].getLastName().compareTo(costomersCopy[j].getLastName());
				if (compare > 0) {
					transferBetweenEachOther(costomersCopy, i, j);
				} else if (compare == 0) {
					compare = costomersCopy[i].getFirstName().compareTo(costomersCopy[j].getFirstName());
					if (compare > 0) {
						transferBetweenEachOther(costomersCopy, i, j);
					} else if (compare == 0) {
						if (costomersCopy[i].getPatronymic() != null && costomersCopy[j].getPatronymic() != null) {
							compare = costomersCopy[i].getPatronymic().compareTo(costomersCopy[j].getPatronymic());
							if (compare > 0) {
								transferBetweenEachOther(costomersCopy, i, j);
							}
						} else if (costomersCopy[i].getPatronymic() == null
								&& costomersCopy[j].getPatronymic() != null) {
							transferBetweenEachOther(costomersCopy, i, j);
						}
					}
				}
			}
		}
		return costomersCopy;
	}

	public void printCostomers(Costomer[] costomers) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < costomers.length; i++) {
			builder.append(costomers[i].toString());
		}
		System.out.println(builder);
	}

	private void transferBetweenEachOther(Costomer[] costomersCopy, int i, int j) {
		Costomer buffer = costomersCopy[i];
		costomersCopy[i] = costomersCopy[j];
		costomersCopy[j] = buffer;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (costomers != null ? costomers.hashCode() : 1);
		result = result * prime + (NO_MATCHES_FOUND_THIS_QUERY != null ? NO_MATCHES_FOUND_THIS_QUERY.hashCode() : 1);
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
		for (int i = 0; i < costomers.length; i++) {
			builder.append(costomers[i].toString());
		}
		return builder.toString();
	}
}