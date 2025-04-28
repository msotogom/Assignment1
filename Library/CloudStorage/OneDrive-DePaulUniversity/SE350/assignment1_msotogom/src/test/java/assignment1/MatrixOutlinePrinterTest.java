package assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixOutlinePrinterTest {

    @Test
    public void testNotNull() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix m = new Matrix(data);
        MatrixOutlinePrinter printer = new MatrixOutlinePrinter(m);

        assertNotNull(printer.getMatrix());
    }

    @Test
    public void testMatrixChange() {
        int[][] data1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] data2 = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);

        MatrixOutlinePrinter printer = new MatrixOutlinePrinter(m1);
        printer.setMatrix(m2);

        assertEquals(m2, printer.getMatrix());
    }
}
