package assignment1;

public class BoolMatrixPrinter extends MatrixPrinter {

    public BoolMatrixPrinter(Matrix matrix) {
        super(matrix);
    }

    @Override
    public void printMatrix() {
        int[][] data = getMatrix().getData();
        int rows = getMatrix().getRows();
        int cols = getMatrix().getCols();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (data[i][j] != 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
