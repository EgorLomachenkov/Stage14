package by.itstep.lomachenkov.stage14.levelA.controller;

import by.itstep.lomachenkov.stage14.levelA.model.VectorLogic;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task2 {
    public static void main(String[] args) {
        Printer.print("This program calculates amount of zero values" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int counter = VectorLogic.getZeroValuesAmount(vector);

        Printer.print(counter + "");
    }
}