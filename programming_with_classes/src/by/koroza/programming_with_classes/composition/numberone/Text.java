package by.koroza.programming_with_classes.composition.numberone;

public class Text {
	private Sentence[] sentences;

	public Text() {

	}

	public Text(Sentence[] sentences) {
		this.sentences = sentences;
	}

	public Sentence[] getSentences() {
		return sentences;
	}

	public void setSentences(Sentence[] sentences) {
		this.sentences = sentences;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (sentences != null ? sentences.hashCode() : 1);
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
		Text text = (Text) object;
		if (sentences == null) {
			if (text.sentences != null) {
				return false;
			}
		} else if (!sentences.equals(text.sentences)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < sentences.length; i++) {
			builder.append(sentences[i].toString());
			if (i < sentences.length - 1) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
}