package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] tablica = new int [15];
	int lemght = tablica.length;

	for (int i = 0; i < tablica.length; i++) {

	    if (i%2 == 1){
	        tablica[i] = i;
        }
        else {
            tablica[i] = i + 1;
        }

    }
	System.out.println(Arrays.toString(tablica));
    }
}
