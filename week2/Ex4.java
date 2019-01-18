/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comproweek2;

/**
 *
 * @author thanawatgualti
 */
public class Ex4 {
     public static void main(String[] args) {
        int i=10,j=3;
        float x = (float) 1.525;
        float y = (float) -0.008;
        float z = (float) 12.26;
        char c = 'A';
        char d = 'F';
        float y1 = (y*2)*(y+z)/j;
        float y2 = j%(i-j)/(z/x);
        float y3 = ((i/3-1)+((j-1)*6)%(i-9))*3;
        float y4 = -x+(y*y+4*x*z)/x;
        float y5 = (c/d)*(-d);
        boolean y6 = !(c<99);
        boolean y7 = !(i*j<c);
        boolean y8 = (c==97)&&!(z>15);
        boolean y9 = (z/2-j<x)||(i-j!=0)||(c>d);
        boolean y10 = (j-i/j)>(d-c/d);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
        System.out.println(y5);
        System.out.println(y6);
        System.out.println(y7);
        System.out.println(y8);
        System.out.println(y9);
        System.out.println(y10);
    }
}
