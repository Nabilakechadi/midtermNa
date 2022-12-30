package datastructure;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {

// use bufferreader class, init bufferreader and filereader

// along with required variables

// given textfile
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:\\Users\\nabil\\IdeaProjects\\midterm-coding-exam\\src\\data\\self-driving-car");
			String str = "";
			try {
				br = new BufferedReader(fr);
				while ((str = br.readLine()) != null) {
					System.out.println(str);
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if (br != null) {
						br.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}



