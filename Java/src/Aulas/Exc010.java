package Aulas;

import javax.xml.transform.Source;
import java.util.Scanner;
/**
 *
 * Crie um programa que fique repetindo um menu até o usuário escolher a opção de sair.
 * Peça um número.
 * Mostre o menu:
 * [1] Dobro
 * [2] Triplo
 * [0] Sair
 * Se ele digitar 1, mostre o dobro. Se digitar 2, o triplo. Se digitar 0, encerre o programa com uma mensagem de despedida.
 *
 */

public class Exc010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Escolha de Menu -----");
        System.out.println(" Informe um Numero ");
        int num = sc.nextInt();
        int escolha = -1;
        int resultado = 0;

        while (escolha != 0) {
            System.out.println("---Continuando---");
            System.out.println(" ---- Opção [1] - Dobra ");
            System.out.println(" ---- Opção [2] - Triplica ");
            System.out.println(" ---- Opção [3] - Informe o valor do Multiplicador ");
            System.out.println(" ---- Opção [0] - Sair  ");
            escolha = sc.nextInt();

           switch (escolha){
               case 0:
                   break;
               case 1:
               resultado = num * 2;
                   System.out.println("o Dobro de " + num + " é igual a " + resultado + " resultado");
                   break;
               case 2:
                resultado = num * 3;
                System.out.println("o Triplo de " + num + " é igual a " + resultado  + " esultado");
                    break;
               case 3:
                   System.out.println("Informe o Valor!: "); //opção extra para multiplicar por um valor personalizado
                   int num2 = sc.nextInt();
                   resultado = num * num2;
                   System.out.println(num + " x " + num2 + " é igual a " + resultado);
                   break;
               default:
                   System.out.println("Escolha Invalida!!");
                    break;
           }
        }
        System.out.println("Programa encerrado!!");
    }
}
