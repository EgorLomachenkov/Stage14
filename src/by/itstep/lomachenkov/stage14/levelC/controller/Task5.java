package by.itstep.lomachenkov.stage14.levelC.controller;

import by.itstep.lomachenkov.stage14.levelC.model.VectorLogic;
import by.itstep.lomachenkov.stage14.util.FormResult;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task5 {
    public static void main(String[] args) {
        Printer.print("This program calculates the amount of elements that" +
                " approximates to arithmetic mean of all elements" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        Printer.print("Enter the calculation tolerance: ");

        int accuracy = Input.inputNumber();

        int counter = VectorLogic.getElementsAmountApproximatesAvg(vector, accuracy);

        Printer.print(FormResult.format(counter));
    }
}
