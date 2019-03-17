package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Matrix {

    private double[][] elementData;

    public Matrix(final int row, final int column){
        this.elementData = new double[row][column];
        this.fillElementDataRandom();
    }

    public Matrix(final double[][] matrix){
        this.elementData = matrix;
    }

    public Matrix(final double... value){
        this.elementData = new double[value.length][value.length];
    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix(new double[][]{{1 , 2}, { 1, 2}});
        System.out.println(matrix.toString());

    }

    private void fillElementDataRandom(){
        Random random = new Random();
        for (int i = 0; i < elementData.length; i++){
            for (int j = 0; j < elementData[i].length; j++){
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

    public double getElement(final int index, final int index2){
        return elementData[index][index2];
    }

    public void setElement(final double value, final int index, final int index2){
        this.elementData[index][index2] = value;
    }

    public int size(){
        return elementData.length;
    }

    public int innerSize(final int inner){
        return elementData[inner].length;
    }

    public double[][] toArray(){
        return elementData;
    }

    public static void printMatrix(Matrix matrix){
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.innerSize(i); j++) {
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "elementData=" + Arrays.deepToString(elementData) +
                '}';
    }

}