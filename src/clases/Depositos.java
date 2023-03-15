package clases;

public class Depositos extends Principal{

    @Override
    public void Transacciones() {
        System.out.println("                            ");
        System.out.println("Ingrese saldo a depositar: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("-------------------------");
        System.out.println("Deposito: "+deposito);
        System.out.println("Saldo actual: "+getSaldo());
        System.out.println("-------------------------");
    }
}
