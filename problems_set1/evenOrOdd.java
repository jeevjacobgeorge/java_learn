package problems_set1;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();
         if (no % 2 == 0)
               System.out.println(no + " is even");
         else
               System.out.println(no + " is odd");

         sc.close();
	}

}
