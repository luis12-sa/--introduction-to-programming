package usta.fis;

import java.util.Scanner;
/*
*NAME:JORGE D._JUAN JOSE T._MIGUEL ROMERO
* DATE:26 MARCH 2021
* DESCRIPTION:PARCIAL 1
 */

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_height=0;
        for (int i=1;i<=5;i=i+1) {
            System.out.println("----children: "+i+"----");
            v_total_height=v_total_height+p_user_height();
        }
        float v_average_height=v_total_height/5;
        System.out.println("the average height of the children: "+v_average_height+" cm");
    }
    public static void p_show_info_program(){
        System.out.println("╔══════════════════════════╗");
        System.out.println("Softavarageheight V1.0");
        System.out.println("Maker:JORGE D._JUAN JOSE T._MIGUEL ROMERO.");
        System.out.println("Date: March / 26 / 2021");
        System.out.println("╚══════════════════════════╝");
    }
    public static int p_user_height() {
        //DESCRIPTION: This method return the average height of five children
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/Type  height(cm): ");
        int v_height = keyboard.nextInt();
        while(v_height<50||v_height>200) {
            System.err.println("ERR:the height must be more than 50 cm and it must be less than 200 ");
            v_height=keyboard.nextInt();
        }
        return v_height;
    }
}
