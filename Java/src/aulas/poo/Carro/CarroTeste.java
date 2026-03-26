package aulas.poo.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro(2000);


        carro1.statusCarro();
        carro1.motorLigado();
        carro1.andar();
        carro1.statusCarro();
        carro1.parar();
        carro1.desligarMotor();
        carro1.statusCarro();
    }
}
