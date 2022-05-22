package by.koroza.programming_with_classes.composition.numberone;

public class Word {
	private String word;

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (word != null ? word.hashCode() : 1);
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
		Word word = (Word) object;
		if (this.word == null) {
			if (word.word != null) {
				return false;
			}
		} else if (!this.word.equals(word.word)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(word);
		return builder.toString();
	}
}