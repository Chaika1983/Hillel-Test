package firsTask;

import java.io.*;

public class Stream {
	private File file;
	private BufferedReader bufRead;
	private FileReader fileRead;

	public Stream() {
	}

	public Stream(File file, BufferedReader bufRead, FileReader fileRead) {
		this.file = file;
		this.bufRead = bufRead;
		this.fileRead = fileRead;
	}

	public File getFile(String name) {
		file = new File(name);
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public FileReader getFileRead(File name) {
		try {
			fileRead = new FileReader(name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fileRead;
	}

	public void setFileRead(FileReader fileRead) {
		this.fileRead = fileRead;
	}

	public BufferedReader getBufRead(FileReader name) {
		bufRead = new BufferedReader(name);
		return bufRead;
	}

	public void setBufRead(BufferedReader bufRead) {
		this.bufRead = bufRead;
	}
	public void closeStream() {
		try {
			bufRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
