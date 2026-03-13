package Aulas;
import java.util.Scanner;
/*
* Tabuada: Leia um número e imprima a tabuada dele de 1 a 10.
*
* */
public class Exc008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("--------TABUADA--------");
        System.out.println("Digite o valor a ser multiplicado: ");
        int valor = sc.nextInt();

        System.out.println("------ TABUADA DE " + valor + " ------");
        for(int i = 0; i<= 10; i++){
            int multi = valor * i;
            System.out.println(valor + " x " + i + " = " + multi);
        }
    }
}
