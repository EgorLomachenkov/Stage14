package by.itstep.lomachenkov.stage14.levelA.controller;

import by.itstep.lomachenkov.stage14.levelA.model.VectorLogic;
import by.itstep.lomachenkov.stage14.util.FormResult;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task3 {
    public static void main(String[] args) {
        Printer.print("This program calculates amount of even numbers in vector" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int counter = VectorLogic.getEvenValuesAmount(vector);

        Printer.print(FormResult.format(counter));
    }
}
