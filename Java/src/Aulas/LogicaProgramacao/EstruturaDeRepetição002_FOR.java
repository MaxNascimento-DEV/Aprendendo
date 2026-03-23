package Aulas.LogicaProgramacao;

import java.util.Scanner;
/*
*   Desafio: O Localizador de Extremos 🏆
*   Crie um array de números decimais (double) com 6 posições.
*   Peça ao usuário para digitar os 6 valores (podem ser temperaturas, preços ou notas).
*   Ao final, seu programa deve percorrer o array e informar:
*   Qual é o maior valor digitado.
*   Qual é o menor valor digitado.
*/


public class EstruturaDeRepetição002_FOR {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

        double[] num = new double[6];

        System.out.println("Comparação de Numeros Flutuantes");

        for(int i = 0; i < num.length; i++){
            System.out.println("Digite " + i + " valor flutuantes: ");
            num[i] = sc.nextDouble();
        }
        double maior = num[0];
        double menor = num[0];
        for(int m = 1; m < num.length; m++){
            if(num[m] > maior) {
                maior = num[m];
            }
            if(num[m] < menor) {
                menor = num[m];
            }
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);
        sc.close();
    }
}