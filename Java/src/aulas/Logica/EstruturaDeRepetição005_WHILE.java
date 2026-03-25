package aulas.Logica;

import java.util.Scanner;

public class EstruturaDeRepetição005_WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco;
        double total = 0;
        double quantidade = 0;

        System.out.println("Digite o Preço do produto: ");
        preco = sc.nextDouble();

        while (preco != 0) {
            total = total + preco;
            quantidade++;
            System.out.println("Digite  mais um preço de produto ou (0) para encerrar! : ");
            preco = sc.nextDouble();
        }

        double media = 0;
        if (quantidade > 0) {
            media = total / quantidade;
        }
        System.out.println("O total da compra deu R$" + total + " e foram digitados " + quantidade + " valores");
        System.out.println("E a media de valores ficou entre: " + media);
        sc.close();
    }
}
