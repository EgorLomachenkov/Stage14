package by.itstep.lomachenkov.stage14.levelD.controller;

import by.itstep.lomachenkov.stage14.levelD.model.VectorLogic;
import by.itstep.lomachenkov.stage14.levelD.util.ResultUI;
import by.itstep.lomachenkov.stage14.util.Input;
import by.itstep.lomachenkov.stage14.util.Printer;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Printer.print("This program calculates the product of elements that" +
                " located between max and min elements" +
                "\nEnter the elements of the vector: ");

        double[] vector = Input.inputDoubleVectorValues();

        double product = VectorLogic.getElementsProduct(vector);

        Printer.print(ResultUI.formatProd(product));
    }
}
