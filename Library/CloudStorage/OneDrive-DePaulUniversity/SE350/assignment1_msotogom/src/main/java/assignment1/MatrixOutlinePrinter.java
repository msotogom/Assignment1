package assignment1;

public class MatrixOutlinePrinter extends MatrixPrinter {

    public MatrixOutlinePrinter(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void printMatrix() {
        int[][] data = getMatrix().getData();
        int rows = getMatrix().getRows();
        int cols = getMatrix().getCols();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(data[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
