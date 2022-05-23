package by.koroza.programming_with_classes.composition.numberone;

public class Text {
	private String title;
	private Sentence[] sentences;

	public Text() {

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
		Sentence[] sentencesNew = null;
		if (sentences == null) {
			sentences[0] = sentence;
		} else {
			sentencesNew = new Sentence[sentences.length + 1];
			for (int i = 0; i < sentencesNew.length; i++) {
				if (i < sentences.length) {
					sentencesNew[i] = sentences[i];
				} else if (i == sentences.length) {
					sentencesNew[i] = sentence;
				}
			}
			sentences = sentencesNew;
		}
	}

	public void addSentences(Sentence[] sentences) {
		Sentence[] sentencesNew = null;
		if (this.sentences == null) {
			this.sentences = sentences;
		} else {
			sentencesNew = new Sentence[this.sentences.length + sentences.length];
			for (int i = 0; i < sentencesNew.length; i++) {
				if (i < this.sentences.length) {
					sentencesNew[i] = this.sentences[i];
				} else if (i >= this.sentences.length) {
					sentencesNew[i] = sentences[i - this.sentences.length];
				}
			}
			this.sentences = sentencesNew;
		}
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (title != null ? title.hashCode() : 1);
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
		builder.append(title).append("\n");
		for (int i = 0; i < sentences.length; i++) {
			builder.append(sentences[i].toString());
			if (i < sentences.length - 1) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
}