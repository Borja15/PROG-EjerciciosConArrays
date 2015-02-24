package cuadradomagico;

import java.util.Random;
import java.util.logging.Logger;

public class MagicSquare {
    private static final Logger LOG = Logger.getLogger(MagicSquare.class.getName());

    private int[][] matrix;
    private int size;

    public int[][] getMatrix() {
        return matrix;
    }

    public MagicSquare() {
        this.size = 3;
        createMatrix(size);
    }

    public MagicSquare(int size) {
        this.size = size;
        createMatrix(size);
    }

    private void createMatrix(int size) {
        do {
            matrix = new int[size][size];
            generateSquare();
        } while (!isCorrect());
    }

    private void generateSquare() {
        Random random = new Random();
        int number;
        boolean repeated;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                do {
                    number = random.nextInt(size * size) + 1;
                    repeated = isRepeated(number);
                    if (!repeated) {
                        matrix[i][j] = number;
                    }
                } while (repeated);
            }
        }
    }

    private boolean isRepeated(int number) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCorrect() {
        int tmpSum = 0;
        // Save first row sum
        int sumRow1 = 0;
        for (int i = 0; i < size; i++) {
            sumRow1 += matrix[0][i];
        }

        // Check rows (ignoring first row)
        for(int i=1; i<size; i++) {
            tmpSum = 0;
            for (int j = 0; j < size; j++) {
                tmpSum += matrix[i][j];
            }
            if (sumRow1 != tmpSum) {
                return false;
            }
        }

        // Check columns
        for(int i=0; i<size; i++) {
            tmpSum = 0;
            for (int j = 0; j < size; j++) {
                tmpSum += matrix[j][i];
            }
            if (sumRow1 != tmpSum) {
                return false;
            }
        }

        // Check first diagonal
        tmpSum = 0;
        for (int i = 0; i < size; i++) {
            tmpSum += matrix[i][i];
        }
        if (sumRow1 != tmpSum) {
            return false;
        }

        // Check second diagonal
        tmpSum = 0;
        for (int i = 0; i < size; i++) {
            tmpSum += matrix[i][size - i - 1];
        }
        if (sumRow1 != tmpSum) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result += matrix[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

}
