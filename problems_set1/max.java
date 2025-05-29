package problems_set1;

public class max {

	public static void main(String[] args) {
		// Declare and initialize an array of 10 integers and find the maximum value
		int [] arr = {1,3,2,4,2,1,5,3,2,7};
		int max = arr[0];
		for (int i = 1; i<arr.length;i++) {
			if (arr[i]>max)
				max = arr[i];
		}
		System.out.println("Maximum is "+max);
		
		
	}

}
