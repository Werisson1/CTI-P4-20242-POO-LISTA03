package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[8];
        int pos[] = new int[8];
        int neg[] = new int[8];
        int cont_n = 0, cont_p = 0, i;

        for (i = 0; i < 8; i++) {  
            System.out.println("Posição " + (i + 1) + " do Vetor Num:");
            num[i] = sc.nextInt();
            if (num[i] >= 0) {
                pos[cont_p] = num[i];
                cont_p++;
            } else {
                neg[cont_n] = num[i];
                cont_n++;
            }
        }
        
        if (cont_n == 0) {
            System.out.println("Vetor de negativos vazio");
        } else {
            System.out.print("Vetor de negativos: ");
            for (i = 0; i < cont_n; i++) {
                System.out.print(neg[i] + " ");
            }
            System.out.println();
        }
        
        if (cont_p == 0) {
            System.out.println("Vetor de positivos vazio");
        } else {
            System.out.print("Vetor de positivos: ");
            for (i = 0; i < cont_p; i++) {
                System.out.print(pos[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
