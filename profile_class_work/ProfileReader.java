package profile_class_work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProfileReader {
	public static String read(String path) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader csv = new BufferedReader(new FileReader(path))) {
			String row ;
			while((row = csv.readLine())!=null) {
				sb.append(row).append("\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return sb.toString();
		
	}

}
