package com.company;

import java.util.Arrays;

public class FRQProblems {
    public static void main(String[]args){
        System.out.println(Arrays.toString(multiplesOf(10,10)));
        int[][] pixels = new int[][]{{254,0,100,0},{0,0,254,0},{254,0,0,0}};
        brighten(pixels, 2000);
        System.out.println(Arrays.deepToString(pixels));
        printPassorFail(new String[]{"bob","mira","jenkins"}, new double[]{65.0,45.0,90.0});
    }

    // First Question
    public static int[] multiplesOf(int number, int count) {
        int[] multiples = new int[count];
        int adding = number;
        for (int i = 0; i < count; i++) {
            multiples[i] = adding;
            adding += number;
        }
        return multiples;
    }
    public static void brighten(int[][] pixels, int amount){
        for(int i = 0; i < pixels.length;i++){
            for(int j = 0;j < pixels[0].length;j++){
                pixels[i][j]+= amount;
                pixels[i][j] = Math.min(255,pixels[i][j]);
            }
        }
    }

    public static void printPassorFail(String[] names, double[] grades){

        for(int i = 0; i < names.length; i++){
            String passFail = "fail";
            if(grades[i] >= 65.0){
                passFail = "pass";
            }
            System.out.print(names[i] + ": " + passFail);
            if(i != names.length -1){
                System.out.print(", ");
            }
        }
    }



}
