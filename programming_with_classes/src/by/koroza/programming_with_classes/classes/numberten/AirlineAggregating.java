package by.koroza.programming_with_classes.classes.numberten;

import by.koroza.programming_with_classes.classes.numbereight.Costomer;

public class AirlineAggregating {
	private Airline[] airlines;

	public AirlineAggregating() {

	}

	public AirlineAggregating(Airline[] airlines) {
		this.airlines = airlines;
	}
	
	/*public void addCostomer(Airline airline) {
		Costomer[] airlineNew = new Costomer[costomers.length + 1];
		for (int i = 0; i < costomersNew.length; i++) {
			if (i < costomers.length) {
				costomersNew[i] = costomers[i];
			} else if (i == costomers.length) {
				costomersNew[i] = costomer;
			}
		}
		this.costomers = costomersNew;
	}*/

}
