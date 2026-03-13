package Aulas;
import java.util.Scanner;
/*
* Soma de Intervalo: Peça ao usuário dois números e some todos os inteiros entre eles.
* */
public class Exc009 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Digite um valor: ");
         int valor1 = sc.nextInt();
         System.out.println("Digite outro valor: ");
         int valor2 = sc.nextInt();
         int soma = 0;

         for(int i = valor1; i <= valor2; i++) {
             soma = soma + i;
         }
         System.out.println(soma);
    }
}
