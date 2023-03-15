package clases;

public class ConsultaSaldo extends  Principal{

    @Override
    public void Transacciones() {
        System.out.println("                         ");
        System.out.println("Saldo actual:"+ getSaldo());
        System.out.println("                         ");
    }
}
