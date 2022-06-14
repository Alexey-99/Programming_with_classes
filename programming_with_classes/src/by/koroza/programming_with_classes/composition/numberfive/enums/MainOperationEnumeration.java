package by.koroza.programming_with_classes.composition.numberfive.enums;

public class MainOperationEnumeration {
	private static String[] operations = { "View all travel packages", "View countries that have travel packages",
			"View cities that have tourist packages",  };

	public static String[] getOperations() {
		return operations;
	}

	public static void setOperations(String[] operations) {
		MainOperationEnumeration.operations = operations;
	}
	
	
}