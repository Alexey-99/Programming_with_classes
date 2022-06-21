package by.koroza.programming_with_classes.classes.numberthree;

public class Student {
	private String lastName;
	private String initials;
	private int numberGroup;
	private int[] academicPerformance = new int[5];

	private static final String NEXT_LINE = "\n";
	private static final String LAST_NAME = "Last name - ";
	private static final String INITIALS = "Initials - ";
	private static final String NUMBER_GROUP = "Number group - ";
	private static final String ACADEMIC_PERFOMANCE = "Academic performance - ";

	public Student(String lastName, String initials, int numberGrou, int academicPerformanceOne,
			int academicPerformanceTwo, int academicPerformanceThree, int academicPerformanceFour,
			int academicPerformanceFive) {
		this.lastName = lastName;
		this.initials = initials;
		this.numberGroup = numberGrou;
		this.academicPerformance[0] = academicPerformanceOne;
		this.academicPerformance[1] = academicPerformanceTwo;
		this.academicPerformance[2] = academicPerformanceThree;
		this.academicPerformance[3] = academicPerformanceFour;
		this.academicPerformance[4] = academicPerformanceFive;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int numberGroup) {
		this.numberGroup = numberGroup;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (lastName != null ? lastName.hashCode() : 1);
		result = result * prime + (initials != null ? initials.hashCode() : 1);
		result = result * prime + numberGroup;
		result = result * prime + academicPerformance.hashCode();
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (LAST_NAME != null ? LAST_NAME.hashCode() : 1);
		result = result * prime + (INITIALS != null ? INITIALS.hashCode() : 1);
		result = result * prime + (NUMBER_GROUP != null ? NUMBER_GROUP.hashCode() : 1);
		result = result * prime + (ACADEMIC_PERFOMANCE != null ? ACADEMIC_PERFOMANCE.hashCode() : 1);
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
		Student student = (Student) object;
		if (lastName == null) {
			if (student.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(student.lastName)) {
			return false;
		}
		if (initials == null) {
			if (student.initials != null) {
				return false;
			}
		} else if (!initials.equals(student.initials)) {
			return false;
		}
		if (numberGroup != student.numberGroup) {
			return false;
		}
		if (academicPerformance != student.academicPerformance) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append(LAST_NAME).append(lastName).append(NEXT_LINE);
		build.append(INITIALS).append(initials).append(NEXT_LINE);
		build.append(NUMBER_GROUP).append(numberGroup).append(NEXT_LINE);
		build.append(ACADEMIC_PERFOMANCE);
		for (int i = 0; i < academicPerformance.length; i++) {
			build.append(academicPerformance[i]);
			if (i < academicPerformance.length - 1) {
				build.append(", ");
			}
		}
		build.append(NEXT_LINE);
		return build.toString();
	}
}