package DSAProblemSolving;

import java.util.Arrays;

public class Problem6SpiralMatrix {

    public static void main(String[] args){

        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        System.out.println("Spiral matrix : " + Arrays.toString(spiralmatrix(mat)));

    }

    public static int[] spiralmatrix(int[][] mat){
        int rowMin = 0, colMin = 0;
        int rowMax = mat.length-1, colMax = mat[0].length-1;
        int totalMatrixElements = mat.length * mat[0].length;
        int[] spiralMatrix = new int[totalMatrixElements];
        int k = 0;

        while(k < totalMatrixElements) {
            System.out.println("\nTop boundary : \n");        // rowMin is fixed, traverse colMin to colMax
            for (int j = colMin; j <= colMax && k < totalMatrixElements; j++) {
                System.out.print(mat[rowMin][j] + "\t");
                spiralMatrix[k++] = mat[rowMin][j];

            }
            rowMin++;
            System.out.println("\nRight boundary : \n");    // colMax is fixed, traverse rowMin to rowMax
            for (int i = rowMin; i <= rowMax && k < totalMatrixElements; i++) {
                System.out.print(mat[i][colMax] + "\t");
                spiralMatrix[k++] = (mat[i][colMax]);
            }
            colMax--;
            System.out.println("\nBottom boundary : \n");   // rowMax is fixed, traverse colMax to colMin
            for (int j = colMax; j >= colMin && k < totalMatrixElements; j--) {
                System.out.print(mat[rowMax][j] + "\t");
                spiralMatrix[k++] = mat[rowMax][j];
            }
            rowMax--;
            System.out.println("\nLeft boundary : \n");     // colMin is fixed, traverse rowMax to rowMin
            for (int i = rowMax; i >= rowMin && k < totalMatrixElements; i--) {
                System.out.print(mat[i][colMin] + "\t");
                spiralMatrix[k++] = mat[i][colMin];
            }
            colMin++;
        }
        return spiralMatrix;
    }
}
