package firsTask;

import java.util.Arrays;

public class WordsMain {


	public static void main(String[] args) {
		ShowWords show = new ShowWords();
		System.out.println(show.readFile("Words.txt"));//�������� � ������ ����.
		System.out.println(Arrays.deepToString(show.putArray()));//������ ��������� ���� ��� ������ ����������.
		System.out.println(show.showList("�"));//����� ���� �� ������ �����.
		System.out.println(show.findWord("�����"));// ������ �� �����.
		
	}
}
