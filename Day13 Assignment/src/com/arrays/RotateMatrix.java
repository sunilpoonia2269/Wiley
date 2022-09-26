package com.arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,2,3,4}, {4,5,6,6}, {7,8,9,9}, {1,5,6,5}};
		
		printMatrix(matrix);
		
		rotateMatrixAntiClockWise(matrix);

	}

	private static void rotateMatrixAntiClockWise(int[][] matrix) {
	
		
		int[][] rotatedMatrix = new int[matrix.length][matrix.length];
		
		
		int oldRowIndex = 0;
		int oldColumnIndex = matrix.length - 1;
		
		int newRowIndex = 0;
		int newColumnIndex = 0;
		
		while(oldColumnIndex >= 0) {
			while(oldRowIndex < matrix.length) {
				rotatedMatrix[newRowIndex][newColumnIndex] = matrix[oldRowIndex][oldColumnIndex];
				oldRowIndex++;
				newColumnIndex++;
			}
			oldRowIndex = 0;
			newColumnIndex = 0;
			oldColumnIndex--;
			newRowIndex++;
		}
		
		System.out.println("\nMatrix after rotate is : \n");
		
		printMatrix(rotatedMatrix);
		
	}

	private static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
