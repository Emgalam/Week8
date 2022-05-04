/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    static String textinput;
    static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
        

        System.out.println("Enter a sentence and press Enter:");
        textinput = scanner.nextLine();

        System.out.println();
        System.out.println("The words entered are:");
        String text[] = textinput.split(" ");
        for (String txt : text){
            System.out.println(txt);
        }

        System.out.println();
        System.out.println("The uppercase words are:");
        for (String txt : text){
           if(txt.charAt(0) >= 65 && txt.charAt(0) <= 90){
               System.out.println(txt);
           }
        }
    } 
}
