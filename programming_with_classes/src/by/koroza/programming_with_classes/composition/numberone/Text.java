package by.koroza.programming_with_classes.composition.numberone;

public class Text {
	private static final String SPACE = " ";
	private static final String NEXT_LINE = "\n";
	
	private String title;
	private Sentence[] sentences;

	public Text() {
		this.sentences = new Sentence[0];
	}

	public Text(String title, Sentence[] sentences) {
		this.title = title;
		this.sentences = sentences;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Sentence[] getSentences() {
		return sentences;
	}

	public void setSentences(Sentence[] sentences) {
		this.sentences = sentences;
	}

	public void addSentence(Sentence sentence) {
		Sentence[] sentencesNew = new Sentence[sentences.length + 1];
		for (int i = 0; i < sentencesNew.length; i++) {
			if (i < sentences.length) {
				sentencesNew[i] = sentences[i];
			} else if (i == sentences.length) {
				sentencesNew[i] = sentence;
			}
		}
		sentences = sentencesNew;
	}

	public void addSentences(Sentence[] sentences) {
		Sentence[] sentencesNew = new Sentence[this.sentences.length + sentences.length];
		for (int i = 0; i < sentencesNew.length; i++) {
			if (i < this.sentences.length) {
				sentencesNew[i] = this.sentences[i];
			} else if (i >= this.sentences.length) {
				sentencesNew[i] = sentences[i - this.sentences.length];
			}
		}
		this.sentences = sentencesNew;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (title != null ? title.hashCode() : 1);
		result = result * prime + (sentences != null ? sentences.hashCode() : 1);
		result = result * prime + (SPACE != null ? SPACE.hashCode() : 1);
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
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
		if (title == null) {
			if (text.title != null) {
				return false;
			}
		} else if (!title.equals(text.title)) {
			return false;
		}
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
		builder.append(title).append(NEXT_LINE);
		for (int i = 0; i < sentences.length; i++) {
			builder.append(sentences[i].toString());
			if (i < sentences.length - 1) {
				builder.append(SPACE);
			}
		}
		return builder.toString();
	}
}