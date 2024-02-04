package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the sum of elements that" +
                " located between 1st and last zero-elements" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int sum = VectorLogic.getElementsSumBetweenFirstLastZeroElements(vector);

        Printer.print(ResultUI.formatSum(sum));
    }
}
