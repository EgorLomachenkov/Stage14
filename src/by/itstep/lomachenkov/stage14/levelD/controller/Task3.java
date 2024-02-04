package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task3 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the sum of elements that" +
                " located before last positive element" +
                "\nEnter the elements of the vector: ");

        double[] vector = Input.inputDoubleVectorValues();

        double sum = VectorLogic.getElementsSumBeforeLastPositive(vector);

        Printer.print(ResultUI.formatSum(sum));
    }
}
