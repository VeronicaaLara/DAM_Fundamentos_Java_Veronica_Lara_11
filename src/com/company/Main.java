package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pedir un número
        //Mostrarlo con las cifras al revés

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9.999");



        String v = sc.next();
        String inv = "";


        for (int i = v.length()-1; i >= 0; i--){
            inv += v.charAt(i);

        }

        System.out.println(inv);


        sc.close();







    }
}
