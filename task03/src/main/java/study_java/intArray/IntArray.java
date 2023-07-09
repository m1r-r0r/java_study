package study_java.intArray;

import java.util.Arrays;
import java.util.Scanner;

public class IntArray {
    private int[] intArray = new int[20];
    private int minValIndex = 0;
    private int maxValIndex = 0;
    private boolean check = false;
    public IntArray() {
        for(int i=0; i < 20; i++) {
            intArray[i] = (int) (Math.random() * 21) - 10;
            if((intArray[maxValIndex] >= 0 && intArray[i] < 0) || (intArray[i] > intArray[maxValIndex] && intArray[i] < 0)) maxValIndex = i;
            if((intArray[minValIndex] <= 0 && intArray[i] > 0)  || (intArray[i] < intArray[minValIndex] && intArray[i] > 0)) minValIndex = i;
        }
        if(intArray[maxValIndex] < 0 && intArray[minValIndex] > 0) check = true;
    }
    public void reverseIntArray() {
        if(check) {
            int tmp = intArray[minValIndex];
            intArray[minValIndex] = intArray[maxValIndex];
            intArray[maxValIndex] = tmp;
        }
    }

    public void printIntArray() {
        System.out.println(Arrays.toString(intArray));
    }

    public boolean getCheck() {
        return check;
    }
}
