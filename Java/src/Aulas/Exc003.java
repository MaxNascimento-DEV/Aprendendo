package Aulas;


import java.util.Scanner;

public class Exc003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
* Exc: Exercícios de Estrutura Condicional (if/else) Par ou Ímpar: Receba um
*  número e informe se é par ou ímpar, positivo ou negativo.
* */

        System.out.println("Digite um Numero: ");
        int num1 = sc.nextInt();
        int result = num1 % 2;

        if (result != 0){
            System.out.println("numero impar");
        }
        else {
            System.out.println("Numero Par");
        }
        if(num1 > 0) {
            System.out.println("Numero Positivo");
        }
        else if(num1 < 0) {
            System.out.println("Numero Negativo");
        }
        else{
            System.out.println("Numero é 0");
        }
        sc.close();
    }
    }

