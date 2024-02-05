package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task8 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the sum of elements that" +
                " located after last zero-element" +
                "\nEnter the elements of the vector: ");

        int[] vector = Input.inputVectorValues();

        int sum = VectorLogic.getSumAfterLastZero(vector);

        Printer.print(ResultUI.formatSum(sum));
    }
}
