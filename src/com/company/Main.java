package com.company;

public class Main {

    //programmet som helhed returnere det største antal gange det samme tal optræder i træk i arrayet.
    //programmet tjekker videre selvom den har fundet false, men det skal den ikke. Vi kan optimere dette ved at stoppe med at tjekke, så snart den har fået en false.
    //Vi kan også slette if-statementet (j==i) da den aldrig bliver kørt, og derfor ikke behøver at blive tjekket. (usikker)

    public static void main(String[] args) {
	int[] A = new int[]{3,2,2,2,4,5,5,3};

	Algoritmer alg = new Algoritmer();
        System.out.println(alg.ALG1(A,A.length));
    }
}
