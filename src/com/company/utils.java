package com.company;

public class utils {
    public static <T> void printArr(T [][] iArr){
        for(int i = 0; i < iArr.length; i++){
            for (int j = 0; j < iArr[i].length; j++) {
                System.out.print(iArr[i][j] + " ");
            }
        }
        System.out.println();
    }
}
