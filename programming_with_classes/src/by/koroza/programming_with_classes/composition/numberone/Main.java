/* Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста. 
 */

package by.koroza.programming_with_classes.composition.numberone;

public class Main {

	public static void main(String[] args) {
		Word[] words1 = { new Word("Lorem"), new Word("ipsum"), new Word("dolor"), new Word("sit"), new Word("amet"),
				new Word("consectetur"), new Word("adipisicing"), new Word("elit.") };
		Word[] words2 = { new Word("Natus"), new Word("corporis"), new Word("molestias"), new Word("asperiores"),
				new Word("minima"), new Word("delectus"), new Word("cum"), new Word("animi"), new Word("reprehenderit"),
				new Word("doloremque"), new Word("voluptate"), new Word("similique"), new Word("vitae,"),
				new Word("architecto,"), new Word("magnam"), new Word("autem"), new Word("quae"), new Word("totam"),
				new Word("ad"), new Word("veritatis"), new Word("eligendi"), new Word("enim"), new Word("adipisci?") };
		Word[] words3 = { new Word("Voluptate"), new Word("necessitatibus"), new Word("commodi"),
				new Word("perspiciatis"), new Word("libero"), new Word("explicabo"), new Word("labore"),
				new Word("accusamus"), new Word("architecto"), new Word("quas"), new Word("cum"), new Word("enim!") };
		Word[] words4 = { new Word("Modi,"), new Word("sit"), new Word("corporis!") };
		Word[] words5 = { new Word("Voluptas"), new Word("soluta"), new Word("illo"), new Word("eaque?") };

		Sentence sentence1 = new Sentence(words1);
		Sentence sentence2 = new Sentence(words2);
		Sentence sentence3 = new Sentence(words3);
		Sentence sentence4 = new Sentence(words4);
		Sentence sentence5 = new Sentence(words5);

		Sentence[] sentences = { sentence1, sentence2, sentence3, sentence4, sentence5 };

		Text text = new Text(sentences);

	}
}