package com.teachmeskills.lesson8.part2;

import com.teachmeskills.lesson8.part2.utils.Utils;

public class Runner {
    public static void main(String[] args) {
        int [][] arrayFirst = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int [][] arraySecond = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        Utils.showMatrix(arrayFirst);
        Utils.showMatrix(arraySecond);
        int[][] arrayThird = Utils.doMultiplicationMatrix(arrayFirst,arraySecond);
        Utils.showMatrix(arrayThird);
    }
}
