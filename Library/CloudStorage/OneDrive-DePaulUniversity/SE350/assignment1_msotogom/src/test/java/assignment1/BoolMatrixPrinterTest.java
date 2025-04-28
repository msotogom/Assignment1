package assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BoolMatrixPrinterTest {

    @Test
    public void testBoolMatrixNotNull() {
        int[][] data = {{1, 0}, {0, 1}};
        Matrix m = new Matrix(data);
        BoolMatrixPrinter printer = new BoolMatrixPrinter(m);

        assertNotNull(printer.getMatrix());
    }

    @Test
    public void testBoolMatrixChange() {
        int[][] data1 = {{1, 0}, {0, 1}};
        int[][] data2 = {{0, 1}, {1, 0}};
        Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);

        BoolMatrixPrinter printer = new BoolMatrixPrinter(m1);
        printer.setMatrix(m2);

        assertEquals(m2, printer.getMatrix());
    }
}
