package start2030;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] arg) throws IOException {
		FileWriter writer=new FileWriter("response.txt");
		writer.write("i am learning java with selenium");
		writer.close();
		System.out.println();
	}

}
