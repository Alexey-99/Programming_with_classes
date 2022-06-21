package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationOnHavingInList;

public class TypeEnumeration {
	private static String[] types = new String[0];
	private static final int ONE_ELEMENT = 1;

	public static String[] getTypes() {
		return types;
	}

	public static void setTypes(String[] types) {
		TypeEnumeration.types = types;
	}
	
	public static void addTypeInList(String type) {
		boolean isHavingType = ValidationOnHavingInList.checkingOnHavingTypeInList(type);
		if (isHavingType == false) {
			addType(type);
		}
	}
	
	public static void printCities() {
		for (int i = 0; i < types.length; i++) {
			System.out.println(i + " - " + types[i]);
		}
	}
	
	private static void addType(String type) {
		String[] typesNew = new String[types.length + ONE_ELEMENT];
		for (int i = 0; i < typesNew.length; i++) {
			if (i < types.length) {
				typesNew[i] = types[i];
			} else if (i == types.length) {
				typesNew[i] = type;
			}
		}
		types = typesNew;
	}
}