package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task7 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the product of elements that" +
                " located after element with the biggest absolute value" +
                "\nEnter the elements of the vector: ");

        double[] vector = Input.inputDoubleVectorValues();

        double prod = VectorLogic.getElementsProdAfterAbsMax(vector);

        Printer.print(ResultUI.formatProd(prod));
    }
}
