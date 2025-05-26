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
public class p1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        int cont1 = num1;
        int cont2 = num2;
        int cont3 = num3;
        int comp;
        
        if (cont1 < cont2) {
            comp = cont1;
            cont1 = cont2;
            cont2 = comp;
        }
        
        if (cont2 < cont3) {
            comp = cont2;
            cont2 = cont3;
            cont3 = comp;
        }
        
        if (cont1 < cont2) {
            comp = cont1;
            cont1 = cont2;
            cont2 = comp;
        }
        
        System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", cont3, cont2, cont1, num1, num2, num3);
        
        input.close();
    }
}
