import clases.ConsultaSaldo;
import clases.Principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Principal mensajero = new ConsultaSaldo();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese saldo inicial: ");
        int saldoInicial= teclado.nextInt();

        mensajero.setSaldo(saldoInicial);
        mensajero.Operaciones();
    }
}