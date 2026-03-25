package Aulas.LogicaProgramacao;

import java.util.Scanner;

public class ContadorIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int dentro = 0;
        int fora = 0;

        System.out.println("Digite 10 numeros inteiros ");
        for(int i = 0; i < num.length; i++){
            System.out.print("Digite o " + (i+1) + "° numero inteiro: ");
            num[i] = sc.nextInt();
            if(num[i] >= 10 && num[i] <= 20 ){
                dentro++;
            }
            else{
                fora++;
            }
        }
        double porcentagemD = (dentro * 100) / 10;
        double poercentagemF = (fora * 100) / 10;
        System.out.println("Quantidade de numeros dentro do intervalo [10,20]: " + dentro + " (" + porcentagemD + "%)");
        System.out.println("Quantidade de numeros fora do intervalo [10,20]: " + fora + " (" + poercentagemF +"%)");
        sc.close();

    }
}
