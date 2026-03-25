package Aulas.POO.Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 17, 1.75);

        pessoa1.apresentar();
        pessoa1.FazerAniversario();
        if(pessoa1.ehMaiorDeIdade()){
            System.out.println(pessoa1.nome + " é maior de idade.");
        } else {
            System.out.println(pessoa1.nome + " é menor de idade.");
        }
    }
}
