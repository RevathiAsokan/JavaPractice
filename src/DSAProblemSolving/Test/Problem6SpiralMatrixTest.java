package DSAProblemSolving.Test;

import DSAProblemSolving.Problem6SpiralMatrix;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem6SpiralMatrixTest {

    @Test
    public void TestCase1(){
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] spiralMatrix = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        int[] resultSpiralMatrix = Problem6SpiralMatrix.spiralmatrix(mat);
        assertArrayEquals(spiralMatrix, resultSpiralMatrix);
    }

    @Test
    public void TestCase2(){
        int[][] mat = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        int[] spiralMatrix = {1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8,9};
        int[] resultSpiralMatrix = Problem6SpiralMatrix.spiralmatrix(mat);
        assertArrayEquals(spiralMatrix, resultSpiralMatrix);
    }

//    @Test
//    public void TestCase1DSAPractice(){
//        int[][] mat = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
//        int[] spiralMatrix = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
//        int[] resultSpiralMatrix = DSAPractice.spiralmatrix(mat);
//        assertArrayEquals(spiralMatrix, resultSpiralMatrix);
//    }
//
//    @Test
//    public void TestCase2DSAPractice(){
//        int[][] mat = {{1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15}};
//        int[] spiralMatrix = {1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8,9};
//        int[] resultSpiralMatrix = DSAPractice.spiralmatrix(mat);
//        assertArrayEquals(spiralMatrix, resultSpiralMatrix);
//    }

}