package clases;

public class Retiros extends Principal{

    @Override
    public void Transacciones() {
        System.out.println("                            ");
        System.out.println("Ingrese cantidad a retirar: ");
        Retiro();

        if(retiro <= getSaldo()){
            transacciones= getSaldo();
            setSaldo(transacciones -retiro);
            System.out.println("---------------------------------");
            System.out.println("Transaccion exitosa por: "+retiro);
            System.out.println("Saldo actual: "+ getSaldo());
            System.out.println("---------------------------------");
        }else{
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
        }
    }
}
