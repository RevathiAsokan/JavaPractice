package DSAProblemSolving.Test;

import DSAProblemSolving.DSAPractice;
import DSAProblemSolving.Problem5MatrixRotate90;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem5MatrixRotate90Test {

    @Test
    public void TestCase1(){
        int[][] inputMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] rotatedMatrix = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        int[][] resultMatrix = Problem5MatrixRotate90.matrixRotate90(inputMatrix);
        assertArrayEquals(rotatedMatrix, resultMatrix);

    }

    @Test
    public void TestCase1LeetCode75(){
        int[][] inputMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] rotatedMatrix = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        int[][] resultMatrix = DSAPractice.rotateMatrix90(inputMatrix);
        assertArrayEquals(rotatedMatrix, resultMatrix);

    }

}