package assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

    @Test
    public void testNotNull() {
        int[][] shape = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        GameOfLife game = new GameOfLife(shape);

        assertNotNull(game.getShape());
    }

    @Test
    public void testNextGenerationSize() {
        int[][] shape = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        GameOfLife game = new GameOfLife(shape);
        game.nextGeneration();

        assertEquals(3, game.getShape().length);
        assertEquals(3, game.getShape()[0].length);
    }
}
