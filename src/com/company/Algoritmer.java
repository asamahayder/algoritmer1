package com.company;

public class Algoritmer {

    public Algoritmer() {
    }

    public int ALG1(int[] A,int n){
        int l = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.println(ALG2(A,i,j));
                if (ALG2(A,i,j) && j-i+1>l){
                    l=j-i+1;
                }

            }
        }
        return l;
    }

    public boolean ALG2(int[] A,int i, int j){
        if (i == j){
            return true;
        }
        for (int k = i; k < j ; k++) {
            if (A[k] != A[k+1]){
                return false;
                //her tjekker den om det samme tal optræder to gange i træk i arrayet, hvis det gør, så returnere den true. ellers returnere den false.
            }
        }
        return true;
    }
}
