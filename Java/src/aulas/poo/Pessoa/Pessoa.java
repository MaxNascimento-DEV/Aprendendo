package aulas.poo.Pessoa;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }
    public boolean ehMaiorDeIdade(){
        return idade >= 18;
    }
    public void FazerAniversario(){
        idade++;
        System.out.println("Parabéns! Agora você tem " + idade + " anos.");
    }
}
