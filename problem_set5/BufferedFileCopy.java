package problem_set5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourcePath = "src/problem_set5/1.jpg";
		String destPath = "src/problem_set5/1_copy.jpg";
		long startTime = System.nanoTime();
		try(
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
		){
			byte[] buffer = new byte[8192];
			int bytesRead;

			while((bytesRead = bis.read(buffer)) !=-1 ) {
				bos.write(buffer, 0, bytesRead);
			}
			bos.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		long durationInNano = endTime - startTime;
        double durationInMillis = durationInNano / 1_000_000.0;
        System.out.println("Time taken: " + durationInNano + " ns (" + durationInMillis + " ms)");

		
	}

}
