package start2030;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File cfile=new File("reponse.txt");
		try {
			if(cfile.createNewFile()) {
				System.out.println("file created :"+cfile.getName());
				
			}else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
