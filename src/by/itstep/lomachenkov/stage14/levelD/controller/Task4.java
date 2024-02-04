package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task4 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the product of elements that" +
                " located between 1st and 2nd zero-elements" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int prod = VectorLogic.getElementsProdBetweenFirstSecZeroElements(vector);

        Printer.print(ResultUI.formatProd(prod));
    }
}
