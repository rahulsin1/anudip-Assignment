package Matrix;

public class Matrix {
	public static void main(String[] args)
	{
		int rows=3,columns=3;
		int [][]arr1 = {{68,75,37},{76,35,98},{87,26,46}};
		int [][]arr2 = {{25,35,87},{45,83,60},{26,65,81}};
		
		AddTwoMatrix(arr1,arr2,rows,columns);

	}
	
	public static void AddTwoMatrix(int [][]arr1,int [][]arr2,int rows,int columns) {
		int [][]sum = new int[rows][columns];
		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns;j++) {
				sum[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		printMatrix(sum);
	}
	
	public static void printMatrix(int [][]sum) {
		System.out.println("Sum of two matrices is: ");
		for(int[] row: sum) {
			for(int columns:row) {
				System.out.print(columns +" ");
			}
			System.out.println();
		}

	}

}
