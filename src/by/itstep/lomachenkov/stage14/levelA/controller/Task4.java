package by.itstep.lomachenkov.stage14.levelA.controller;

import by.itstep.lomachenkov.stage14.levelA.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelA.util.FormResult;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task4 {
    public static void main(String[] args) {
        Printer.print("This program calculates amount of odd numbers in vector" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int counter = VectorLogic.getOddValuesAmount(vector);

        Printer.print(FormResult.format(counter));
    }
}
