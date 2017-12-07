package firsTask;

public class TextString {
	private String words;
	private String text;
	private String textArray[];

	public TextString() {

	}

	public TextString(String text, String[] textArray, String words) {
		this.text = text;
		this.textArray = textArray;
		this.words = words;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getText() {
		text = text.toLowerCase();
		text = text.replaceAll("\\pP", "");
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getTextArray() {
		return textArray;
	}

	public void setTextArray(String[] textArray) {
		this.textArray = textArray;

	}

}
