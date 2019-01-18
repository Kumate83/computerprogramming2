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
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input temperature1 (F): ");
        float F1 = input.nextFloat();
        System.out.print("Please input temperature1 (F): ");
        float F2 = input.nextFloat();
        System.out.print("Please input temperature1 (F): ");
        float F3 = input.nextFloat();
        float C1 = 5*(F1-32)/9;
        float C2 = 5*(F2-32)/9;
        float C3 = 5*(F3-32)/9;
        System.out.format("\ntemperature1: %.0f F is %.2f C",F1,C1);
        System.out.format("\ntemperature2: %.0f F is %.2f C",F2,C2);
        System.out.format("\ntemperature3: %.0f F is %.2f C",F3,C3);
        System.out.println("");
    }
}
