package com.company;

import java.util.Arrays;

public class ArrayTesting {
    public static void main(String[] args){
        int[] data = {1, 2, 3, 4, 5, 6};
        int[] newData = Arrays.copyOf(data, 2 * data.length);
        int[] newData2 = Arrays.copyOfRange(data, 0,2);
        System.out.println(Arrays.toString(newData));
        System.out.println(Arrays.toString(newData2));
    }
}
