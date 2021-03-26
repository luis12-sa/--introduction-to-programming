package usta.fis;
//AUTHOR:Luis MGL
//DATE: 2021-march-16
//DESCRIPTION:software show variable than input by keyboard


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("--------------");
        System.out.println("softinputnum version 1.0");
        System.out.println("MAKER:Luis MGL");
        System.out.println("--------------");
        Scanner keyboard = new  Scanner(System.in);

        int v_number1, v_number2, v_sum;
        System.out.println("input the first number:");
        v_number1= keyboard.nextInt();
        System.out.println("input the second number:");
        v_number2= keyboard.nextInt();
        v_sum= v_number1+v_number2;
        System.out.print("the toatal sum si "+v_sum);

    }
}
