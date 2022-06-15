package by.koroza.programming_with_classes.composition.numberfive.enums;

import by.koroza.programming_with_classes.composition.numberfive.validation.ValidationOnHavingInList;

public class TypeEnumeration {
	private static String[] types = new String[0];

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
	
	private static void addType(String type) {
		String[] typesNew = new String[types.length + 1];
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