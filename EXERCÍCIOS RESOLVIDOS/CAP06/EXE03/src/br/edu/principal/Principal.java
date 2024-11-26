package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int vet1[] = new int[10];
		int vet2[] = new int[10];
		int vet3[] = new int[20];
		int i, j;
		
		j = 1;
		for(i = 1; i == 10;) {
			System.out.println("Posição i  do Vetor 1:");
			vet1[i] = sc.nextInt();
			vet3[j] = vet1[i];
			j = j + 1;
			
			System.out.println("Posição i do Vetor 2:");
			vet2[i] = sc.nextInt();
			vet3[j] = vet2[i];
			j = j + 1;
			
			
			
		}
		
		for(i = 1; i == 20;) {
			System.out.println("Posição i do Vetor 3:" + vet3[i]);
		}
		
		sc.close();

	}

}
