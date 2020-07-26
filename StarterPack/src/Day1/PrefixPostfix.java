/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author nar-u
 */
public class PrefixPostfix {
    public static void main(String[] args) {
        
        int number1 = 0;
        int number2 = 0;
        
        // print number to see value in variable
        System.out.println("----NUMBER1----");
        System.out.println(number1);
        // using prefix plus to number1
        System.out.println("USING PREFIX PLUS");
        // plus number after print
        System.out.println(++number1);
        // print number to see value in variable
        System.out.println("----NUMBER1----");
        System.out.println(number1);
        System.out.println("");
        // print number to see value in variable
        System.out.println("----NUMBER2----");
        System.out.println(number2);
        // using postfix plus to number2
        System.out.println("USING POSTFIX PLUS");
        // plus number and show in print
        System.out.println(number2++);
        // print number to see value in variable
        System.out.println("----NUMBER2----");
        System.out.println(number2);
        
        
    }
}
