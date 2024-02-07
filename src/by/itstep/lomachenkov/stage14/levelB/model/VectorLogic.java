package by.itstep.lomachenkov.stage14.levelB.model;

public class VectorLogic {
    //O(N)
    public static int getNumberQuantityGreaterThanNumber(int[] vector, int number) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > number) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getNumberQuantityEqualsToNumber(int[] vector, int number) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == number) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getNumberQuantityNumberMultiples(int[] vector, int number) {
        if (number == 0) {
            return -1;
        }

        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % number == 0) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getAbsNumberQuantityGreaterThanNumber(int[] vector, int number) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (getAbsValue(vector[i]) > number) {
                counter++;
            }
        }

        return counter;
    }

    //O(N)
    public static int getAbsNumberQuantityEqualsNumber(int[] vector, int number) {
        int counter = 0;

        for (int i = 0; i < vector.length; i++) {
            if (getAbsValue(vector[i]) == number) {
                counter++;
            }
        }

        return counter;
    }

    //O(1)
    private static int getAbsValue(int number) {
        return number < 0 ? -number : number;
    }
}
