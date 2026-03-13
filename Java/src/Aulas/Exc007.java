package Aulas;

import java.util.Scanner;
/*
 * Aprovação Escolar: Leia quatro notas, calcule a média e diga se o aluno foi aprovado
 *(media >= 7), está em recuperação (5 <= média < 7) ou reprovado (media < 5).
 */

public class Exc007 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.next();
        System.out.println("Digite a nota do 1AV: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota do 2AV: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota da 3AV: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("A media do " + aluno + " foi " + String.format("%.2f", media) + " e esta aprovado por media!!");
        }
        else if(media >= 5 ){
            System.out.println("A media do aluno " + aluno + " foi " + String.format("%.2f", media) + " e esta em recuperação!");
        }
        else{
            System.out.println("A media do " + aluno + " foi " + String.format("%.2f", media)+ " e está reprovado!!");
        }
    }
}
