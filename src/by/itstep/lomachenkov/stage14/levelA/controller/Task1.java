package by.itstep.lomachenkov.stage14.levelA.controller;

import by.itstep.lomachenkov.stage14.levelA.model.VectorLogic;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;


public class Task1 {
    public static void main(String[] args) {
        Printer.print("This program calculates amount of non-zero values" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int counter = VectorLogic.getNonZeroValuesAmount(vector);

        Printer.print(counter + "");
    }
}
