package Aulas;

import java.util.Scanner;

/*
 * Exc006
 * Maior de Três: Leia três números e imprima qual deles é o maior.
 *
 * */
public class Exc006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Maior de Três");
        System.out.println("-----------------");
        System.out.println("Digite o Primeiro Numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o Segundo Numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o Terceiro Numero: ");
        int num3 = sc.nextInt();

        int maior = num1;
        if(num2 > maior) {
            maior = num2;
        }
        if (num3 > maior){
            maior = num3;
        }
        System.out.println("o Numero maior é o " + maior);
        }
    }
