package Aulas;

import java.util.Scanner;

/*
* Exc: Crie um algoritimo que receber o valor em kg e devolver o valor transformado em libras.
* */

public class Exc004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor em Kg para saber em Libras: ");
        double kg = sc.nextDouble();
        double result = kg * 2.2046;

        System.out.println(kg + "kg é equivalente a " + result + "lbs em libras.");
        sc.close();
    }
}
