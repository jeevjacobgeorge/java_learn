package problem_set6;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadTask implements Runnable {
	String fileUrl;
	String savePath;

	public DownloadTask(String fileUrl, String savePath) {
		this.fileUrl = fileUrl;
		this.savePath = savePath;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try (BufferedInputStream in = new BufferedInputStream(new URL(fileUrl).openStream());
				FileOutputStream file = new FileOutputStream(savePath);) {
			System.out.println("Downloading from" + savePath);
			byte[] buffer = new byte[8192];
			int bytesRead ;

			while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
				file.write(buffer, 0, bytesRead);
			}
			System.out.println("File Saved to "+savePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
