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

	public void addWord(Word word) {
		Word[] wordsNew = null;
		if (words == null) {
			words[0] = word;
		} else {
			wordsNew = new Word[words.length + 1];
			for (int i = 0; i < wordsNew.length; i++) {
				if (i < words.length) {
					wordsNew[i] = words[i];
				} else if (i == words.length) {
					wordsNew[i] = word;
				}
			}
			words = wordsNew;
		}
	}

	public void addWords(Word[] words) {
		Word[] wordsNew = null;
		if (this.words == null) {
			this.words = words;
		} else {
			wordsNew = new Word[this.words.length + words.length];
			for (int i = 0; i < wordsNew.length; i++) {
				if (i < this.words.length) {
					wordsNew[i] = this.words[i];
				} else if (i >= this.words.length) {
					wordsNew[i] = words[i - this.words.length];
				}
			}
			this.words = wordsNew;
		}
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