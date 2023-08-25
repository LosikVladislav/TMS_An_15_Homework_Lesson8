package com.teachmeskills.lesson8.part2.utils;

import java.util.Arrays;

/**
 * Создайте класс Utils.
 * Данном классе создайте статический метод для вывода матрицы на экран используюя Syste.out.println.
 * Метод на вход должные принимать двумерный массив, а на выход он не должен ничего возвращать.
 * Используйте этот статический метод в классе для решения задачи умножения матриц.
 * Используйте этот статический метод для вывода матрицы на экран трижды - вывод первой матрицы, вывод второй матрицы, вывод результата.
 */

public abstract class Utils {
    public static void showMatrix(int[][] array){
        System.out.println(Arrays.deepToString(array));
    }
    public static int[][] doMultiplicationMatrix(int[][] first, int[][] second){
        int[][] arrayThird = new int[first.length][second[0].length];
        for (int i = 0; i < first.length ; i++){
            for(int j = 0; j < second[0].length; j++){
                int sum = 0;
                for(int k = 0; k < first[0].length; k++){
                    sum+=first[i][k]*second[k][j];
                }
                arrayThird[i][j]=sum;
            }
        }
        return arrayThird;
    }
}
