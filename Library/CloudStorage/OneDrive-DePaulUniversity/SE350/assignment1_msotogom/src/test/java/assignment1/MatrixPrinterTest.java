package assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixPrinterTest {

    @Test
    public void testGetMatrix() {
        int[][] data = {{1, 2}, {3, 4}};
        Matrix m = new Matrix(data);
        MatrixPrinter printer = new MatrixPrinter(m);

        assertEquals(m, printer.getMatrix());
    }

    @Test
    public void testSetMatrix() {
        int[][] data1 = {{1, 1}, {1, 1}};
        int[][] data2 = {{2, 2}, {2, 2}};
        Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);

        MatrixPrinter printer = new MatrixPrinter(m1);
        printer.setMatrix(m2);

        assertEquals(m2, printer.getMatrix());
    }
}

