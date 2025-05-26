package br.cefet.inf;

import java.util.Scanner;

public class p1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine()) {
            String linha = in.nextLine();
            int nivel = 0;
            boolean ok = true;

            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);

                if (c == '(') {
                    nivel++;
                } else if (c == ')') {
                    if (nivel > 0) {
                        nivel--;
                    } else {
                        ok = false;
                        break;
                    }
                }
            }

            if (nivel != 0) ok = false;
            
            System.out.println(ok ? "correct" : "incorrect");
        }
        
        in.close();
    }
}
