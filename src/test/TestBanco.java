
package test;

import dominio.Cliente;
import dominio.Cuenta;
import java.util.Scanner;


public class TestBanco {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cliente=null;
        Cuenta cuenta=null;
        String cedula,nombre,nombrec;
        double depositar,retirar;
        double saldo;
        int op=0;
        do
        {
            System.out.print("1. Crear Cliente\n2. Asignar Cuenta\n3. Depositar\n"
                    + "4. Retirar\n5. Saldo\n6. Salir\nDigite una Opcion>> ");
            op=entrada.nextInt();
            switch(op){
            case 1:
                System.out.print("Cedula: ");
                cedula=entrada.next();
                System.out.print("Nombre: ");
                nombre=entrada.next();
                cliente = new Cliente(cedula, nombre);
                break;
            case 2:
                entrada.nextLine();
                System.out.print("Nombre Cuenta <<A><<C>><<P>>");                
                nombrec = entrada.next();
                System.out.print("Saldo: ");
                saldo = entrada.nextDouble();
                cuenta = new Cuenta(nombrec, saldo);
                cliente.agregarCuenta(cuenta);
                break;
            case 3:
                nombrec=null;
                System.out.print("Ingrese Nro Cta: ");
                nombrec = entrada.next();
                System.out.println("Cantidad Dinero");
                depositar = entrada.nextDouble();
                cliente.ingresarDinero(nombrec, depositar);
                break;
            case 4:
                nombrec=null;
                System.out.print("Ingrese Nro Cta: ");
                nombrec = entrada.next();
                System.out.println("Cantidad Dinero");
                retirar = entrada.nextDouble();
                cliente.retirarDinero(nombrec, retirar);
                break;
            case 5:
                cliente.verCuentas();
                break;
        }
        }while(op!=6);        
    }
}
