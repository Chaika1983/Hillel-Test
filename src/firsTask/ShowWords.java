package firsTask;

import java.io.IOException;
import java.util.ArrayList;

public class ShowWords {
	public ArrayList<String> list;
	TextString text = new TextString();
	Stream stream = new Stream();

	public String readFile(String file) {
		try {
			text.setText(stream.getBufRead(stream.getFileRead(stream.getFile(file))).readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		stream.closeStream();
		return text.getText();
	}

	public String[] putArray() {
		text.setTextArray(text.getText().split(" "));
		return text.getTextArray();
	}

	public ArrayList<String> showList(String leter) {
		list = new ArrayList<String>();

		for (int i = 0; i < text.getTextArray().length - 1; i++) {
			if(leter == leter.toUpperCase()) {
				leter = leter.toLowerCase();
			}
			if (text.getTextArray()[i].startsWith(leter) == true) {
				text.setWords(text.getTextArray()[i]);
				list.add(text.getWords());
			}
		}
		if (leter.isEmpty()) {
			text.setWords("Ведите первую букву");
		}
		if (text.getWords() == null) {
			text.setWords("Слов на эту букву нет");
		}
		for (String wordsList : text.getTextArray()) {
			if (list.indexOf(wordsList) != list.lastIndexOf(wordsList)) {
				list.remove(list.lastIndexOf(wordsList));
			}
		}
		return list;

	}

	public String findWord(String word) {
		for (int i = 0; i < text.getTextArray().length - 1; i++) {
			if (word.isEmpty()) {
				System.out.println("Ведите слово");
			}
			if (text.getTextArray()[i].equalsIgnoreCase(word)) {
				text.setWords(text.getTextArray()[i]);
			}

		}
		if (text.getWords() == null) {
			text.setWords("Такого слова нет");
		}
		return text.getWords();

	}

}
