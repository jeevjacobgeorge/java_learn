package file_class_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String args[]) {
		String srcPath = "src/file_class_work/hello.txt";
		
		try(FileInputStream fis = new FileInputStream(srcPath);) {
			int data;
			System.out.println("Reading file contents....");
			while((data = fis.read())!=-1) {
				System.out.print((char) data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
	}
	
	
}
