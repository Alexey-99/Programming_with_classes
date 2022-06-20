package by.koroza.programming_with_classes.composition.numberfive.enums;

public class MainOperationEnumeration {
	private static String[] operations = { "View all travel packages", "View countries that have travel packages",
			"View cities that have tourist packages", "View types of travel packages", "View added travel vouchers",
			"Exit" };

	public static String[] getOperations() {
		return operations;
	}

	public static void setOperations(String[] operations) {
		MainOperationEnumeration.operations = operations;
	}

	public static void printOperations() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < operations.length; i++) {
			builder.append(i).append(" - ").append(operations[i]);
			if (i < operations.length - 1) {
				builder.append("\n");
			}
		}
		System.out.println(builder);
	}
}