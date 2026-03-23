package Aulas.LogicaProgramacao;

import java.util.Scanner;

public class EstruturaDeRepetição004_WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = -1;
        double total = 0;
        int numtotal = 0;

        System.out.println("Digite o preçco do produto: ");
        preco = sc.nextDouble();

        while (preco > 0) {
            total += preco;
            numtotal++;
            System.out.println("Digite o preçco do produto: ");
            preco = sc.nextDouble();
        }
        double media = 0;
        if (numtotal > 0) {
            media = total / numtotal;
        }
        System.out.println("O total da compra deu R$" + total + " e foram digitados " + numtotal + " valores");
        System.out.println("E a media de valores ficou entre: " + media);
        sc.close();
    }
}
