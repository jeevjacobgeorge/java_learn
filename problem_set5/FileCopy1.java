package problem_set5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy1 {
    public static void main(String[] args) {
        try (
            FileReader fr = new FileReader("src/problem_set5/saple.txt");
            FileWriter fw = new FileWriter("sample_copy.txt")
        ) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("Copy successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
