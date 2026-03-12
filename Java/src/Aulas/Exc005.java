package Aulas;

import java.util.Scanner;

/*
* Exc005
* Conversor de Temperatura: Crie um programa que leia uma
*  temperatura em Celsius e a converta para Fahrenheit
*
* */
public class Exc005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Convertendo Grau Celsius em Fahrenheit");
        System.out.println("---------------------------------------");
        System.out.println("Digite o grau para ser convertido: ");
        double C = sc.nextDouble();
        double F = C * 1.8 + 32;

        System.out.println(C + "C é igual a " + F + " Fahrenheit");
        sc.close();
    }
}
