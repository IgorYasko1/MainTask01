package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.util.Random;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 *
 */

public class Matrix {

    private final double[][] elementData;

    public Matrix(final int row, final int column){
        this.elementData = new double[row][column];
        this.fillElementDataRandom();
    }

    public Matrix(final double[][] matrix){
        this.elementData = matrix;
    }

    private void fillElementDataRandom(){
        Random random = new Random();
        for (int i = 0; i < elementData.length; i++){
            for (int j = 0; j < elementData[i].length; j++){
                elementData[i][j] = random.nextDouble() * 100;
            }
        }
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

}