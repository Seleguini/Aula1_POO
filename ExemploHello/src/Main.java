import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(); //Cria um objeto chamado c1 do tipo ContaCorrente

    c1.cadastrar(12345-6, "Gabriel", 7890-1);
    c1.depositar(1000);
    System.out.println("Saldo:" +c1.ConsultarSaldo());
    c1.sacar(2000);
        System.out.println("Saldo" +c1.ConsultarSaldo());
    }

}

