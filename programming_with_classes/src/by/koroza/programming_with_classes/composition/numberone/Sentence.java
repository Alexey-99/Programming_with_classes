package by.koroza.programming_with_classes.composition.numberone;

public class Sentence {
	private Word[] words;

	public Sentence() {

	}

	public Sentence(Word[] words) {
		this.words = words;
	}

	public Word[] getWords() {
		return words;
	}

	public void setWords(Word[] words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (words != null ? words.hashCode() : 1);
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
		Sentence sentence = (Sentence) object;
		if (this.words == null) {
			if (sentence.words != null) {
				return false;
			}
		} else if (!words.equals(sentence.words)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			builder.append(words[i].toString());
			if (i < words.length - 1) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
}