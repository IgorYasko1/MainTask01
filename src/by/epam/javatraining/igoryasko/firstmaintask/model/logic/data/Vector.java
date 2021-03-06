package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.util.Arrays;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 */

public class Vector {

    private double[] elementData;
    
    public Vector(){
        elementData = new double[0];
    }

    public Vector(final Vector another) {
        this.elementData = another.elementData;
    }

    public Vector(final int size) {
        if (size > 0) {
            elementData = new double[size];
        } else if (size == 0) {
            elementData = new double[]{};
        } else {
            throw new IllegalArgumentException("Illegal size: " + size);
        }
    }

    public Vector(final double[] array) {
        elementData = array;
    }

    public double[] getElementData() {
        return elementData;
    }

    public void setElementData(double[] elementData) {
        this.elementData = elementData;
    }

    public void addElement(final double... number) {
        double[] tmp = Arrays.copyOf(elementData, elementData.length);
        elementData = new double[tmp.length + number.length];
        elementData = Arrays.copyOf(tmp, tmp.length + number.length);
        System.arraycopy(number, 0, elementData, elementData.length - number.length, number.length);
    }

    public void setElement(final double value, final int index) {
        elementData[index] = value;
    }

    public double getElement(final int index) {
        return elementData[index];
    }

    public int size() {
        return elementData.length;
    }

    public double[] toArray() {
        return elementData;
    }

    @Override
    public String toString() {
        return "Vector : " + Arrays.toString(elementData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        return Arrays.equals(elementData, vector.elementData);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elementData);
    }

}
