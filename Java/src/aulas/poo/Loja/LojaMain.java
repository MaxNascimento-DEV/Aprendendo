package aulas.poo.Loja;

import java.util.Scanner;

public class LojaMain {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Loja minhaLoja = new Loja("", "", "", "");

        System.out.println("Digite o nome da loja:");
        minhaLoja.nome = leitor.nextLine();

        System.out.println("Digite o email da loja:");
        minhaLoja.email = leitor.nextLine();

        System.out.println("Digite o telefone da loja:");
        minhaLoja.telefone = leitor.nextLine();

        System.out.println("Digite o endereço da loja:");
        minhaLoja.endereco = leitor.nextLine();

        System.out.println("Loja criada com sucesso!");

        System.out.println("----- Informações da Loja -----");
        System.out.println("Nome: " + minhaLoja.nome);
        System.out.println("Email: " + minhaLoja.email);
        System.out.println("Telefone: " + minhaLoja.telefone);
        System.out.println("Endereço: " + minhaLoja.endereco);

        System.out.print("Deseja Atualizar alguma informação da loja? (sim/nao): ");
        String resposta = leitor.nextLine();

        if(resposta.equalsIgnoreCase("sim")) {
            System.out.println("Qual informação deseja atualizar? (email/telefone/endereco): ");
             resposta = leitor.nextLine();
            switch (resposta) {
                case "email":
                    System.out.println("Digite o novo Email: ");
                    String novoEmail = leitor.nextLine();
                    minhaLoja.atualizarEmail(novoEmail);
                    break;
                case "telefone":
                    System.out.println("Digite o novo Telefone: ");
                    String novoTelefone = leitor.nextLine();
                    minhaLoja.atualizarTelefone(novoTelefone);
                    break;
            }
        }
        else if(resposta.equalsIgnoreCase("nao")) {
            System.out.println("Nenhuma informação atualizado.");
        }
        else {
            System.out.println("Resposta inválida. Atualização encerrada!");
        }


    }
}