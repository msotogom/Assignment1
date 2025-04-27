package assignment1;

public class MatrixPrinter {

    private Matrix matrix;

    public MatrixPrinter(Matrix matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        int[][] data = matrix.getData();
        for (int row = 0; row < matrix.getRows(); row++) {
            for (int col = 0; col < matrix.getCols(); col++) {
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix getMatrix() {
        return matrix;
    }
}
