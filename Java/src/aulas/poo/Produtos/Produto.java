package aulas.poo.Produtos;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void atualizacaoPreco(double preco){
        this.preco = preco;
        System.out.println("O preço do produto " + nome + " foi atualizado para R$ " + preco);
    }
    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -= desconto;
        System.out.println("O preço do produto " + nome + " foi atualizado para R$" + preco + " com um desconto de " + percentual + "%");
    }
    public void adicionarEstoque(int quantidade){
        this.quantidade = quantidade + this.quantidade;
        System.out.println("Quantidade do produto " + nome + " atualizada para " + this.quantidade);
    }


}
