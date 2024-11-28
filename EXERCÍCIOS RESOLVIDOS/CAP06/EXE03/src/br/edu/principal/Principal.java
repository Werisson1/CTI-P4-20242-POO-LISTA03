package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
            vet1[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
            vet2[i] = sc.nextInt();
        }
        
        int j = 0;
        for (int i = 0; i < 10; i++) {
            vet3[j++] = vet1[i];
            vet3[j++] = vet2[i];
        }

        System.out.println("\nVetor resultante da intercalação:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }
        
        sc.close();
    }
}
