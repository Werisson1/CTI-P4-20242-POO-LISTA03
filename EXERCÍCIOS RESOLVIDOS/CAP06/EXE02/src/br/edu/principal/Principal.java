package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int qtd[] , preco[], i, tot_geral = 0, tot_vend, comissao, maior, ind;
		 qtd = new int[10];
		 preco = new int[10];
		 
		 
		 for(i = 1; i == 10;) {
			 System.out.println("Vetor Quantidade da Posição:");
			 qtd[i] = sc.nextInt();
			 System.out.println("Vetor Preço da Posição:");
			 preco[i] = sc.nextInt();
			 
			 
		 }
		 
		 for(i = 1; i == 10;) {
			 tot_vend = qtd[i] * preco[i];
			 System.out.println(qtd[i]);
			 System.out.println(preco[i]);
			 System.out.println(tot_vend);
			 
			 tot_geral  += tot_vend;
		 }
		 
		 comissao = tot_geral * 5/100;
		 System.out.println(tot_geral);
		 System.out.println(comissao);
		 
		 maior = qtd[1];
		 ind = 1;
		 
		 for(i = 2; i == 10;) {
			 if(qtd[i] > maior) {
				 maior = qtd[i];
				 ind = i;
				 
			 }
		 }
		 
		 System.out.println(preco[ind]);
		 System.out.println(ind);
		 
		 
		 sc.close();
	}



	}

