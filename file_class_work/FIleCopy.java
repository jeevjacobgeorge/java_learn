package file_class_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopy {

	public static void main(String[] args) {
		String srcPath = "src/file_class_work/hello.txt";
		String desPath = "src/file_class_work/hello_copy.txt";
		try(
				FileInputStream fis = new FileInputStream(srcPath);
				FileOutputStream fos = new FileOutputStream(desPath);
			)
		{
			int data;
			while((data = fis.read())!= -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
