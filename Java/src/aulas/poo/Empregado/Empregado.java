package aulas.poo.Empregado;

public class Empregado {

    String nome;
    String sobrenome;
    double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }
    public double aplicarAumento(double percentual){
        return salario += salario * percentual / 100;
    }


}
