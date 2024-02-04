package by.itstep.lomachenkov.stage14.levelD.util;

public class ResultUI {
    public static String formatProd(double product) {
        return "Product: %.2f".formatted(product);
    }

    public static String formatProd(int product) {
        return "Product: %d".formatted(product);
    }

    public static String formatSum(double sum) {
        return "Sum: %.2f".formatted(sum);
    }

    public static String formatSum(int sum) {
        return "Sum: %d".formatted(sum);
    }
}
