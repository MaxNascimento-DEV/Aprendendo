package Aulas.LogicaProgramacao;

import java.util.Scanner;

/*  Desafio: O Buscador de Frutas 🍎
*   O que o programa deve fazer:
*   Criar um array de String com 5 frutas já definidas (ex: Maçã, Banana, Uva, Manga, Pera).
*   Pedir para o usuário digitar o nome de uma fruta para buscar.
*   Usar um for para percorrer o array e comparar cada posição com o que o usuário digitou.
*   Exibir se a fruta foi encontrada ou não
 */

public class EstruturaDeRepetição003_FOR {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        String[] frutas = {"Maçã", "Banana", "Uva", "Manga", "Pera"};
        System.out.println("Qual fruta deseja buscar?");
        String busca = sc.next();

        boolean encontrada = false;
        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equalsIgnoreCase(busca)){
                System.out.println("Sucesso! " + busca + " encontrada na posição " + ++i);
                encontrada = true;
                break;
            }
        }
        if(!encontrada){
            System.out.println("Sinto muito, a fruta " + busca + " não está na lista.");
        }
        sc.close();
    }
}
