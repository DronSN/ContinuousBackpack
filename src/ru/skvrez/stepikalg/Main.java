package ru.skvrez.stepikalg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //thing count
        int vol = input.nextInt(); //Backpack volume
        int[] c = new int[n]; // cost of thing
        int[] w = new int[n]; //volume of thing
        for (int i=0; i<n; i++){
            c[i]=input.nextInt();
            w[i] =input.nextInt();
        }
    }
}
