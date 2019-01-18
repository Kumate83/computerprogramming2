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
public class Ex5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        float length;
        System.out.print("Enter width : ");
        float width = input.nextFloat();
        System.out.print("Enter Area : ");
        float area = input.nextFloat();
        length = area / width;
        System.out.println(length);
    }
}
