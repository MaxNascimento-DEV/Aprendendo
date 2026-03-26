package aulas.poo.Carro;

public class Carro {
    int ano;
    boolean status;
    boolean movimento;

    public Carro(int ano) {
        this.ano = ano;
        this.status = false;
        this.movimento = false;
    }

    public void motorLigado() {
        status = true;
        System.out.println("O motor foi ligado");
    }

    public void desligarMotor() {
        status = false;
        movimento = false;
        System.out.println("O motor foi desligado");
    }

    public void andar() {
        if (status) {
            movimento = true;
            System.out.println("O carro está andando");
        }
     else{
            System.out.println("O motor está desligado, ligue o motor para andar");
        }
    }
    public void parar(){
        if(status){
            movimento = false;
            System.out.println("O carro parou");
        }
    }

    public void statusCarro(){
        if(status == true){
            System.out.println("O motor está ligado");
        }
        else{
            System.out.println("O motor está desligado");
        }
        if(movimento){
            System.out.println("O carro está em movimento");
        }
        else{
            System.out.println("O carro está parado");
        }
    }
}




