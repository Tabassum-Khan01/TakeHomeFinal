//Create a method called doesFileExist(String path) which takes
//the path of the file and tells user if the file exists at that path or not. 
//Assume all path are relative to you project structure.
//If the file does not exist, catch the requisite exception. 

package practical2;

import java.io.File;

public class FileExists {

	public static void main(String[] args) {

		doesFileExist();
	}

	public static void doesFileExist() {
		File file = new File("src/Data/Dictionary.xlsx");

		try {
			if (file.exists())
				System.out.println("File Exists.");
		} catch (Exception e) {
			System.out.println("File does not exist.");

		}

	}
}
