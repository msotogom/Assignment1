
package assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixTest {

    @Test
    public void ValidSize() {
        Matrix m = new Matrix(2, 3);
        assertEquals(2, m.getRows());
        assertEquals(3, m.getCols());
    }

    @Test
    public void InvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(0, 0);
        });
    }

    @Test
    public void ValidArray() {
        int[][] array = {{1, 2}, {3, 4}};
        Matrix m = new Matrix(array);
        assertEquals(2, m.getRows());
        assertEquals(2, m.getCols());
    }

    @Test
    public void NullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(null);
        });
    }
}
