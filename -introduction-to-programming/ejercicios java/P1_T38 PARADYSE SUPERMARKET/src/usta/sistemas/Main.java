package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR:luis miguel romero
	 *DATE: 2021/03/19
	 * DESCRIPTION: this software generate a bill of supermarket paradise
	 */
      System.out.println("bill software of supermarket paradise, input the first product");
      Scanner keyboard=new Scanner(System.in);
      int prod1, prod2, prod3, prod4, total_bruto;
      double IVA, total;
      prod1=keyboard.nextInt();
      System.out.println("input second product");
      prod2=keyboard.nextInt();
      System.out.println("input third product");
      prod3=keyboard.nextInt();
      System.out.println("input fourth product");
      prod4=keyboard.nextInt();
      total_bruto=prod1+prod2+prod3+prod4;
      IVA=total_bruto*0.19;
      total=total_bruto+IVA;
      System.out.println("your bill is:");
      System.out.println("total bruto:"+total_bruto);
      System.out.println("IVA:$"+IVA);
      System.out.println("total factura:$"+total);




    }
}
