package by.itstep.lomachenkov.stage14.util;

import java.util.Scanner;

public class Input {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }
    public static int[] inputVectorValues() {
        String[] holder = SCANNER.nextLine().split(" ");

        int[] vector = new int[holder.length];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(holder[i]);
        }

        return vector;
    }

    public static int inputNumber() {
        return SCANNER.nextInt();
    }
}
