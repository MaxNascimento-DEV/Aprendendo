package Aulas.POO.Produtos;

public class ProdutoTeste {
   public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000, 2);

        produto1.atualizacaoPreco(3500);
        produto1.adicionarEstoque(3);
        produto1.aplicarDesconto(10);
    }
}
