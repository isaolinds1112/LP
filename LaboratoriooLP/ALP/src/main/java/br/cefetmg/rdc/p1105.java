package br.cefetmg.rdc;

import java.util.Scanner;

/**
 *
 * @author guerr
 */
public class p1105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int B = sc.nextInt();
            int N = sc.nextInt();

            if (B == 0 && N == 0) break;

            int[] reservas = new int[B];
            for (int i = 0; i < B; i++) {
                reservas[i] = sc.nextInt();
            }

            int[] saldo = reservas.clone();

            for (int i = 0; i < N; i++) {
                int devedor = sc.nextInt() - 1;
                int credor = sc.nextInt() - 1;
                int valor = sc.nextInt();

                saldo[devedor] -= valor;
                saldo[credor] += valor;
            }

            boolean todosOk = true;
            for (int s : saldo) {
                if (s < 0) {
                    todosOk = false;
                    break;
                }
            }

            System.out.println(todosOk ? "S" : "N");
        }

        sc.close();
    }
}
