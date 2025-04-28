//------------------------------------------------------
// Assignment 1
// Written by: Michael Soto
// For SES350 Section Tu/Thu 1:30-3:00 – Spring 2025
//------------------------------------------------------

package assignment1;

public class Matrix {
    private int[][] data;

    public Matrix(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException();
        }
        data = new int[rows][cols];
    }
    //Creates a matrix from a 2d Array.
    public Matrix(int[][] inputData) {
        if (inputData == null || inputData.length == 0 || inputData[0].length == 0) {
            throw new IllegalArgumentException();
        }
        data = inputData;
    }

    public int getRows() {
        return data.length;
    }

    public int getCols() {
        return data[0].length;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] newData) {
        data = newData;
    }
}
