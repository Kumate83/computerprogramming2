package comproweek2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thanawatgualti
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter heigth : ");
        float h = input.nextFloat();
        System.out.print("Enter Radius : ");
        float r = input.nextFloat();
        float V = (float)3.1416*h*r*r;
        System.out.format("\nVolume of the cylinder is %.1f",V);
        
    }
}
