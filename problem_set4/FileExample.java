package problem_set4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file = new File("src/problem_set4/sample.txt"); 
        
        Scanner sc = null;
        try {
        	sc = new Scanner(file);
        	while(sc.hasNextLine()) {
        		System.out.println(sc.nextLine());
        	}
        }
        catch(FileNotFoundException e) {
        	System.out.println("FIle not found");
        }
    
        finally {
        	if (sc!=null) {
        		sc.close();
        	}
        }
	}

}
