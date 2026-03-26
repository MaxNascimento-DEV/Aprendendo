package aulas.poo.Empregado;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EmpregadoMain {
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("Maxwell", "Nascimento", 5000);
        Empregado empregado2 = new Empregado("Maria", "Silva", 3000);

        System.out.println("Salario do empregado 1: " + empregado1.salario);
        System.out.println("Salario do empregado 2: " + empregado2.salario);

        empregado1.aplicarAumento(5);
        empregado2.aplicarAumento(10);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Salario do 1 empregado  após aumento: " + empregado1.salario);
        System.out.println("Salario do 2 empregado  após aumento: " + empregado2.salario);
    }

}
