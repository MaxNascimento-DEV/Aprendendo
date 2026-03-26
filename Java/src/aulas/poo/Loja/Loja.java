package aulas.poo.Loja;

public class Loja {
    String nome;
    String email;
    String telefone;
    String endereco;

    public Loja(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void atualizarEmail(String novoEmail) {
        String emailantigo = this.email;
        this.email = novoEmail;
        System.out.println("Email atualizado de " + emailantigo + " para: " + this.email);
    }
    public void atualizarTelefone(String novoTelefone){
        String telefoneAntigo = this.telefone;
        this.telefone = novoTelefone;
        System.out.println("Telefone atualizado de " + telefoneAntigo + " para: " + this.telefone);
    }
    public void atualizarEndereco(String novoEndereco){
        String enderecoAntigo = this.endereco;
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado de " + enderecoAntigo + " para: " + this.endereco);
    }

}
