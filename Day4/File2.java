package Day4;

import java.io.File;
import java.io.FileWriter;

public class File2 {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("example.txt");
			w.write("Hello !!");
			w.write("Hello World");
			w.close();
		}
		catch(Exception e) {
			System.out.println(e);
					}
	}

}