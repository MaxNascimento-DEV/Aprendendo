package Aulas;

public class Exc001 {
        public void main(String[] args) {

            Exc002 pessoa =  new Exc002(21, "Max", 2003);
            Exc002 pessoa1 = new Exc002(25, "Sabrina", 2000);

            System.out.println(pessoa.getNumber());
            System.out.println(pessoa.getName());
            System.out.println(pessoa.getYears());

            System.out.println(pessoa1.getNumber());
            System.out.println(pessoa1.getName());
            System.out.println(pessoa1.getYears());

                System.out.println("Hellow!! WORD!");

        }
}
