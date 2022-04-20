package by.koroza.programming_with_classes.classes.numberthree;

public class Student {
	private String lastName;
	private String initials;
	private int numberGroup;
	private int[] academicPerformance = new int[5];

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
		build.append("Last name - ").append(lastName);
		return build.toString();
	}
}