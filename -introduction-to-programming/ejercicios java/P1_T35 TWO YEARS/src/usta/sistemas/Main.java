package usta.fin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: luis miguel romero
	 *DATE: 2021/03/12
	 * DESCRIPTION: this software receives two years of birth and print your difference
	 */
  Scaner  } keyboard=new Scanner(System.in);
	int v1, v2, difference;
	System.out.println("this program receives two years of birth and print your difference, input the first year");
	v1=keyboard.nextInt();
	System.out.println("input the second year");
    v2=keyboard.nextInt();
    difference=v1-v2;
    System.out.println("the difference is:"+difference);
    }
}
