package by.itstep.lomachenkov.stage14.levelC.model;

public class VectorLogic {
    public static int getElementsAmountGreaterAvg(int[] vector) {
        int counter = 0;
        double avg = calculateArithmeticMean(vector);

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > avg) {
                counter++;
            }
        }

        return counter;
    }

    public static int getElementsAmountGreaterGeomAvg(int[] vector) {
        int counter = 0;
        double geometricMean = calculateGeometricMean(vector);

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > geometricMean) {
                counter++;
            }
        }

        return counter;
    }

    public static int getElementsAmountApproximatesAvg(int[] vector, int accuracy) {
        int counter = 0;
        double avg = calculateArithmeticMean(vector);

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= (avg - accuracy)
                    && vector[i] <= (avg + accuracy)) {
                counter++;
            }
        }

        return counter;
    }

    private static double calculateArithmeticMean(int[] vector) {
        double sum = vector[0];

        for (int i = 1; i < vector.length; i++) {
            sum += vector[i];
        }

        return sum / vector.length;
    }

    private static double calculateGeometricMean(int[] vector) {
        double product = vector[0];

        for (int i = 1; i < vector.length; i++) {
            product *= vector[i];
        }

        return Math.pow(product, (1d / vector.length));
    }


}
