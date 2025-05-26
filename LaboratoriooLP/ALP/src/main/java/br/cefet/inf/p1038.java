/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefet.inf;

import java.util.Scanner;

/**
 *
 * @author guerr
 */
public class p1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int c = input.nextInt();
        int q = input.nextInt();
        
        System.out.print("Total: R$ ");
        
        switch(c) {
            case 1:
                System.out.printf("%.2f", 4.0 * q);
                break;
            case 2:
                System.out.printf("%.2f", 4.5 * q);
                break;
            case 3:
                System.out.printf("%.2f", 5.0 * q);
                break;
            case 4:
                System.out.printf("%.2f", 2.0 * q);
                break;
            case 5:
                System.out.printf("%.2f", 1.5 * q);
                break;
            default:
                break;
        }
        
        System.out.println();
        
        input.close();
    }
}
