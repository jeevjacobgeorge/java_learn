package ignite.classwork.profile;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ProfileWriter {
	public void write(String data,String path) {
		try(BufferedWriter csv = new BufferedWriter(new FileWriter(path))) {
			csv.write(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
