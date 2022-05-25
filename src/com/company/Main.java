package com.company;

public class Main {

    static int[][] a = {{0, 1, 1, 1, 1, 0},
                        {0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1, 1},
                        {0, 0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0}};
    static int c = 0;

    public static void main(String[] args) {
        count(0);
        System.out.println(c);
    }
    public static void count(int k){
        for(int i = 0; i<6; i++){
            if(a[k][i] > 0){
                if(i==5) c++;
                else count(i);
            }
        }
    }
}
