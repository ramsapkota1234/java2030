package start2030;

import java.io.File;

public class DeleteFile {
	public static void main(String[]args) {
		File deleteF=new File("response.txt");
		if(deleteF.delete()) {
			System.out.println("file is sucessfully deleted");
		}else {
			System.out.println("the file is deleted");
		}
	}

}
