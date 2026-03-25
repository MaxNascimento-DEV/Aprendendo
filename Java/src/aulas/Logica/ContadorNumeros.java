package aulas.Logica;

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        while(true){
            if(num == 0){
                break;
            }
            if(num > 0){
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
            if(num % 2 == 0){
                contadorPares++;
            }
            else{
                contadorImpares++;
            }
            System.out.println("Digite um numero inteiro: ");
            num = sc.nextInt();

        }
        System.out.println("Quantidade de numeros positivos: " + contadorPositivos);
        System.out.println("Quantidade de numeros negativos: " + contadorNegativos);
        System.out.println("Quantidade de numeros pares: " + contadorPares);
        System.out.println("Quantidade de numeros impares: " + contadorImpares);
        sc.close();
    }

}
