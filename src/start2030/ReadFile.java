package start2030;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File read=new File("response.txt");
		try {
			Scanner reader=new Scanner(read);
			if(reader.hasNextLine()) {
				String data=reader.nextLine();
				System.out.println(data);
				reader.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
