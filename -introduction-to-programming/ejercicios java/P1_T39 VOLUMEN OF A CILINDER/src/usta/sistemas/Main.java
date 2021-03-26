package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR:lusi miguel romero
	 *DATE: 2021/03/19
	 *DESCRIPTION: this program calculate the volumen of a cilinder
	 */
	Scanner keyboard=new Scanner(System.in);
	System.out.println("this program calculate the volumen of a cilinder, input the height (cm):");
	double height, radius, volumen;
	height= keyboard.nextDouble();
	System.out.println("input the radius (cm):");
	radius= keyboard.nextDouble();
	volumen=3.1415*Math.pow(radius,2)*height;
	System.out.println("the volumen of the cilinder is:"+volumen);
    }
}
