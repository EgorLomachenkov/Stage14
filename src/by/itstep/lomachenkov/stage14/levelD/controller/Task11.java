package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task11 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the sum of elements that" +
                " located after max element" +
                "\nEnter the elements of the vector: ");

        double[] vector = Input.inputDoubleVectorValues();

        double sum = VectorLogic.getSumAfterMaxElement(vector);

        Printer.print(ResultUI.formatSum(sum));
    }
}
