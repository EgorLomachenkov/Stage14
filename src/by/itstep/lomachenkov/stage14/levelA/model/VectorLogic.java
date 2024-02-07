package by.itstep.lomachenkov.stage14.levelA.model;

public class VectorLogic {

    //O(N)
    public static int getNonZeroValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getZeroValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getEvenValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getOddValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getPositiveValuesAmount(int[] vector) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
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
