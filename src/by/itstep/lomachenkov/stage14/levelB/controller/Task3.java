package by.itstep.lomachenkov.stage14.levelB.controller;

import by.itstep.lomachenkov.stage14.levelB.model.VectorLogic;
import by.itstep.lomachenkov.stage14.util.FormResult;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task3 {
    public static void main(String[] args) {
        Printer.print("This program calculates the amount of elements that" +
                " equals to input number\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        Printer.print("Enter the number: ");

        int number = Input.inputNumber();

        int counter = VectorLogic.getNumberQuantityEqualsToNumber(vector, number);

        Printer.print(FormResult.format(counter));
    }
}
