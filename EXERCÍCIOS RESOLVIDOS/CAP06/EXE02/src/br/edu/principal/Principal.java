package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd[], preco[];
        int i, tot_geral = 0, comissao, maior, ind;

        qtd = new int[10];
        preco = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade vendida do objeto " + (i + 1) + ": ");
            qtd[i] = sc.nextInt();

            System.out.print("Digite o preço unitário do objeto " + (i + 1) + ": ");
            preco[i] = sc.nextInt();
        }

        System.out.println("\nRelatório de Vendas:");
        for (i = 0; i < 10; i++) {
            int tot_vend = qtd[i] * preco[i];
            System.out.println("Objeto " + (i + 1) + ":");
            System.out.println("  Quantidade: " + qtd[i]);
            System.out.println("  Preço unitário: R$ " + preco[i]);
            System.out.println("  Total: R$ " + tot_vend);

            tot_geral += tot_vend;
        }

        comissao = tot_geral * 5 / 100;
        System.out.println("\nTotal Geral das Vendas: R$ " + tot_geral);
        System.out.println("Comissão do Vendedor (5%): R$ " + comissao);

        maior = qtd[0];
        ind = 0;
        for (i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }

        System.out.println("\nObjeto mais vendido:");
        System.out.println("  Índice: " + (ind + 1));
        System.out.println("  Preço unitário: R$ " + preco[ind]);

        sc.close();
    }
}

