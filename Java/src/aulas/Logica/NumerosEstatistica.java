package aulas.Logica;

import java.util.Scanner;

public class NumerosEstatistica {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Digite Dez numeros inteiros -----");
        int num;
        int soma = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "° numero inteiro: ");
            num = scanner.nextInt();
            soma = soma + num;
            if (i == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }
        double media =(double) soma / 10;

        System.out.println("A soma dos numeros digitados é: " + soma);
        System.out.println("A media dos numeros digitados é: " + media);
        System.out.println("O maior numero digitado é: " + maior);
        System.out.println("O menor numero digitado é: " + menor);

    }

}