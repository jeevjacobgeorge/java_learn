package problem_set5;
//Use BufferedReader to read lines from a file and print them to the console
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader reader = new BufferedReader(new FileReader("src/problem_set5/sample.txt"));){
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
