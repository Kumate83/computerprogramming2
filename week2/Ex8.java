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
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1  : ");
        float x1 = input.nextInt();
        System.out.print("Enter x2 : ");
        float x2 = input.nextInt();
        System.out.print("Enter x3 : ");
        float x3 = input.nextInt();
        System.out.print("Enter x4 : ");
        float x4 = input.nextInt();
        float median = (x1+x2+x3+x4)/4;
        System.out.println("Median  is "+median);
    }
}
