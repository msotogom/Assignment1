package assignment1;

public class GameOfLife implements Shape {
    private int[][] shape;

    public GameOfLife(int[][] shape) {
        this.shape = shape;
    }

    @Override
    public int[][] getShape() {
        return shape;
    }

    public void nextGeneration() {
        int rows = shape.length;
        int cols = shape[0].length;
        int[][] next = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int aliveNeighbors = countAliveNeighbors(i, j);

                if (shape[i][j] == 1) {
                    if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                        next[i][j] = 0;
                    }
                    else {
                        next[i][j] = 1;
                    }
                } else {
                    if (aliveNeighbors == 3) {
                        next[i][j] = 1;
                    }
                    else {
                        next[i][j] = 0;
                    }
                }
            }
        }
        shape = next;
    }

    private int countAliveNeighbors(int row, int col) {
        int count = 0;
        int rows = shape.length;
        int cols = shape[0].length;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) {
                    continue;
                }
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    count += shape[i][j];
                }
            }
        }
        return count;
    }
}
