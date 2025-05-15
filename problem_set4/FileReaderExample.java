package problem_set4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Create a method that accepts a file path and reads the content using try-with-re- sources.
//Handle all relevant exceptions.
public class FileReaderExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		File file = new File(sc.nextLine());
		try {			
			sc = new Scanner(file);
			sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("ERROR:"+e.getMessage());
		}

		
	}

}
