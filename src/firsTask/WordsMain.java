package firsTask;

import java.util.Arrays;

public class WordsMain {


	public static void main(String[] args) {
		ShowWords show = new ShowWords();
		System.out.println(show.readFile("Words.txt"));//Выбираем и читаем файл.
		System.out.println(Arrays.deepToString(show.putArray()));//Список отдельных слов без знаков припинания.
		System.out.println(show.showList("Г"));//Выбор слов по первой букве.
		System.out.println(show.findWord("людей"));// Искать по слову.
		
	}
}
