package by.itstep.lomachenkov.stage14.levelA.model;

public class VectorLogic {
    public static int getNonZeroValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int getZeroValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int getEvenValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int getOddValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int getPositiveValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int getNegativeValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                counter++;
            }
        }

        return counter;
    }
}
