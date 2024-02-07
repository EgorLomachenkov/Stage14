package by.itstep.lomachenkov.stage14.levelD.model;

public class VectorLogic {
    // O(N)
    public static double getElementsProduct(double[] vector) throws Exception {
        double prod = 1;

        int maxElementIndex = getMaxElementIndex(vector);
        int minElementIndex = getMinElementIndex(vector);

        if (maxElementIndex < minElementIndex) {
            int t = minElementIndex;
            minElementIndex = maxElementIndex;
            maxElementIndex = t;
        }

        if (maxElementIndex - minElementIndex == 1) {
            throw new Exception("Between elements there are no other elements");
        }

        for (int i = minElementIndex + 1; i < maxElementIndex; i++) {
            prod *= vector[i];
        }

        return prod;
    }

    // O(N)
    public static double getElementsSumBeforeLastPositive(double[] vector) throws Exception {
        double sum = 0;
        int lastPositiveIndex = getLastPositiveElementIndex(vector);

        if (lastPositiveIndex < 1) {
            throw new Exception("There are no positive elements");
        }

        for (int i = 0; i < lastPositiveIndex; i++) {
            sum += vector[i];
        }

        return sum;
    }

    // O(N)
    public static int getElementsSumBetweenFirstLastZeroElements(int[] vector) throws Exception {
        int sum = 0;
        int firstIndex = getZeroElementIndex(vector);

        if (firstIndex == -1) {
            throw new Exception("There are no zero-elements");
        }

        int lastIndex = getLastZeroElementIndex(vector);

        if (lastIndex == firstIndex) {
            throw new Exception("There is only one zero-element");
        }

        for (int i = firstIndex + 1; i < lastIndex; i++) {
            sum += vector[i];
        }

        return sum;
    }

    // O(N)
    public static int getElementsProdBetweenFirstSecZeroElements(int[] vector) throws Exception {
        int prod = 1;
        int firstIndex = getZeroElementIndex(vector);

        if (firstIndex == -1) {
            throw new Exception("There are no zero-elements");
        }

        int lastIndex = getZeroElementIndex(vector, firstIndex);

        if (lastIndex == -1) {
            throw new Exception("There is only one zero-element");
        }

        for (int i = firstIndex + 1; i < lastIndex; i++) {
            prod *= vector[i];
        }

        return prod;
    }

    // O(N)
    public static double getElementsProdAfterAbsMax(double[] vector) throws Exception {
        int index = getAbsMaxElementIndex(vector);

        if (index == vector.length - 1) {
            throw new Exception("The absolute max is the last element");
        }

        double prod = 1;

        for (int i = index + 1; i < vector.length; i++) {
            prod *= vector[i];
        }

        return prod;
    }

    // O(N)
    public static int getSumAfterLastZero(int[] vector) throws Exception {
        int index = getLastZeroElementIndex(vector);

        if (index == -1) {
            throw new Exception("There are no any zero-elements");
        } else if (index == vector.length - 1) {
            throw new Exception("The last zero is the last element");
        }

        int sum = 0;

        for (int i = index + 1; i < vector.length; i++) {
            sum += vector[i];
        }

        return sum;
    }

    // O(N)
    public static double getSumAfterMaxElement(double[] vector) throws Exception {
        int index = getMaxElementIndex(vector);

        if (index == vector.length - 1) {
            throw new Exception("The maximum is the last element");
        } else if (index == -1) {
            throw new Exception("There isn't max element");
        }

        double sum = 0;

        for (int i = index + 1; i < vector.length; i++) {
            sum += vector[i];
        }

        return sum;

    }

    // O(N)
    private static int getLastPositiveElementIndex(double[] vector) {
        int index = -1;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                index = i;
            }
        }

        return index;
    }

    // O(N)
    private static int getMaxElementIndex(double[] vector) {
        double max = vector[0];
        int index = -1;

        for (int i = 1; i < vector.length; i++) {
            if (max < vector[i]) {
                max = vector[i];
                index = i;
            }
        }

        return index;
    }

    // O(N)
    private static int getAbsMaxElementIndex(double[] vector) {
        double max = 0;
        int index = -1;

        for (int i = 0; i < vector.length; i++) {
            if (max <= (vector[i] < 0 ? -vector[i] : vector[i])) {
                max = vector[i] < 0 ? -vector[i] : vector[i];
                index = i;
            }
        }

        return index;
    }

    // O(N)
    private static int getMinElementIndex(double[] vector) {
        double min = vector[0];
        int index = 0;

        for (int i = 1; i < vector.length; i++) {
            if (min > vector[i]) {
                min = vector[i];
                index = i;
            }
        }

        return index;
    }

    // O(N)
    private static int getZeroElementIndex(int[] vector) {
        int index = -1;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                return i;
            }
        }

        return index;
    }

    // O(N)
    private static int getLastZeroElementIndex(int[] vector) {
        int index = -1;

        for (int i = vector.length - 1; i >= 0; i--) {
            if (vector[i] == 0) {
                return i;
            }
        }

        return index;
    }

    // O(N)
    private static int getZeroElementIndex(int[] vector, int startIndex) {
        int index = -1;

        for (int i = startIndex + 1; i < vector.length; i++) {
            if (vector[i] == 0) {
                return i;
            }
        }

        return index;
    }
}
