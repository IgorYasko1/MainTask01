package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class Matrix {

    private double[][] elementData;

    public Matrix() {

    }

    public Matrix(final int row, final int column) {
        this.elementData = new double[row][column];
    }

    public Matrix(final double[][] matrix) {
        elementData = matrix;
    }

    private void fillElementDataRandom() {
        Random random = new Random();
        for (int i = 0; i < elementData.length; i++) {
            for (int j = 0; j < elementData[i].length; j++) {
                elementData[i][j] = random.nextDouble() * 100;
            }
        }
    }

    public double[][] getElementData() {
        return elementData;
    }

    public void setElementData(double[][] elementData) {
        this.elementData = elementData;
    }

    public double getElement(final int index, final int index2) {
        return elementData[index][index2];
    }

    public void setElement(final double value, final int index, final int index2) {
        this.elementData[index][index2] = value;
    }

    public int size() {
        return elementData.length;
    }

    public int innerSize(final int inner) {
        return elementData[inner].length;
    }

    public double[][] toArray() {
        return elementData;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "elementData=" + Arrays.deepToString(elementData) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        return Arrays.deepEquals(elementData, matrix.elementData);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(elementData);
    }

}