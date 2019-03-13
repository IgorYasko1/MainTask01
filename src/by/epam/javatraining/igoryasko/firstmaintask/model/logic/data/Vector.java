package by.epam.javatraining.igoryasko.firstmaintask.model.logic.data;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by igoryasko on 4/1/19.
 *
 * @author igoryasko
 *
 */

public class Vector {

    private final double[] elementData;

    public Vector(final int size){
        this.elementData = new double[size];
        this.fillElementDataRandom();
    }

    public Vector(final double... value){
        this.elementData = new double[value.length];
        this.fillElementData(value);
    }

//    public Vector(){
//
//    }

    private void fillElementDataRandom(){
        Random random = new Random();
        for (int i = 0; i < elementData.length; i++){
            elementData[i] = random.nextDouble() * 100;
        }
    }

    private void fillElementData(final double... value){
        System.arraycopy(value, 0, this.elementData, 0, value.length);
    }

    public void setElement(final double value, final int index){
        this.elementData[index] = value;
    }

    public double getElement(final int index){
        return this.elementData[index];
    }

    public int size(){
        return elementData.length;
    }

    public double[] toArray(){
        return elementData;
    }

    public void print(){
        Arrays.stream(elementData).forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        Vector vector = new Vector(5);
        vector.print();
    }

}
