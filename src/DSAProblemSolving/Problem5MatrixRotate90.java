package DSAProblemSolving;

public class Problem5MatrixRotate90 {

        public static void main(String[] args){

            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            System.out.println("Input matrix :");
            print(matrix);

            matrix = matrixRotate90(matrix);

            System.out.println("Rotate Matrix 90 :");
            print(matrix);
        }

        public static void print(int[][] matrix){
            for(int[] m : matrix){
                for(int val : m){
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }

        public static int[][] matrixRotate90(int[][] matrix){

            //Transpose
            for(int i = 0; i < matrix.length; i++){
                for(int j = i+1; j < matrix[0].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            System.out.println("Transpose of the matrix");
            print(matrix);

            //Swap columns
            int left = 0, right = matrix[0].length - 1; //left - left i.e, the first column and right is the last column
            while(left < right){
                for(int i = 0; i < matrix.length; i++){
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                }
                left++;
                right--;
            }
            System.out.println("Rotated matrix");
            print(matrix);
            return matrix;
        }

    }





