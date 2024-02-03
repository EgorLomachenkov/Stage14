package by.itstep.lomachenkov.stage14.levelC.controller;

import by.itstep.lomachenkov.stage14.levelC.model.VectorLogic;
import by.itstep.lomachenkov.stage14.util.FormResult;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task2 {
    public static void main(String[] args) {
        Printer.print("This program calculates the amount of elements that" +
                " bigger than geometric mean of all elements" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int counter = VectorLogic.getElementsAmountGreaterGeomAvg(vector);

        Printer.print(FormResult.format(counter));
    }
}
