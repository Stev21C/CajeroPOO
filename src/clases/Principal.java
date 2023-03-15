package clases;

import java.util.Scanner;

public abstract class Principal {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner teclado = new Scanner(System.in);

    public void Operaciones(){
        int bandera=0;
        int seleccion=0;

        do {

            do {
                System.out.println("Seleccione una opcion:");
                System.out.println("    1. Consulta saldo");
                System.out.println("    2. Retiros");
                System.out.println("    3. Depositar");
                System.out.println("    4. Salir");
                seleccion = teclado.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a ingresar opcion:");
                    System.out.println("-----------------------------------------------");
                }


            } while (bandera == 0);

            if (seleccion ==1){
                Principal conexSaldo= new ConsultaSaldo();
                conexSaldo.Transacciones();
            } else if (seleccion == 2) {
                Principal conexRetiro = new Retiros();
                conexRetiro.Transacciones();
            } else if (seleccion == 3) {
                Principal conexDeposito = new Depositos();
                conexDeposito.Transacciones();
            }else if (seleccion == 4){
                System.out.println("----------------------");
                System.out.println("Gracias, vuelva pronto");
                System.out.println("----------------------");
                bandera = 2;
            }

        }while(bandera !=2);

    }


    // Metodo solicitar cantidad de retiro.
    public void Retiro(){
        retiro = teclado.nextInt();
    }
    
    // Metodo solicitar deposito
    public void Deposito(){
        deposito = teclado.nextInt();
    }

    // Metodo abstracto
    public abstract void Transacciones();


    // Metodos set y get, para var priv
    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Principal.saldo = saldo;
    }
}
