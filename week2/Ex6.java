/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comproweek2;

import java.util.Scanner;

/**
 *
 * @author thanawatgualti
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter angle in degree : ");
        float degree = input.nextFloat();
        float msin = (float) Math.sin(degree * 3.1415 / 180);
        float mcos = (float) Math.cos(degree * 3.1415 / 180);
        System.out.format("sine of %.1f degree is %.4f \n", degree, msin);
        System.out.format("cos of %.1f degree is %.4f \n", degree, mcos);
    }
}
