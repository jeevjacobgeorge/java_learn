package problems_set1;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat = {
				{1,2,3},
				{3,4,5},
				{5,6,7}
		};
		
		int n = mat.length;
		for(int i = 0; i < n; i++) {
			for (int j = i+1;j<n;j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		for (int[] row: mat) {
			for (int val: row)
				System.out.print(val+" ");
			System.out.println();
		}
	}
	

}
