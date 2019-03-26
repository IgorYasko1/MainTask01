package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.util.Arrays;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class Matrix {

    private double[][] elementData;
    
    public Matrix(){
        elementData = new double[0][0];
    }

    public Matrix(final Matrix another) {
        this.elementData = another.elementData;
    }

    public Matrix(final int row, final int column) {
        if (row < 0 || column < 0) {
            throw new IllegalArgumentException("Illegal row: " + row + " Illegal column: " + column);
        } else if (row == 0) {
            elementData = new double[][]{};
        } else {
            elementData = new double[row][column];
        }
    }

    public Matrix(final double[][] matrix) {
        elementData = matrix;
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
        elementData[index][index2] = value;
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
        return "Matrix : " + Arrays.deepToString(elementData);
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
