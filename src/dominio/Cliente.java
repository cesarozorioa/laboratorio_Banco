package dominio;
public class Cliente {
    private String cedula;
    private String nombres;
    private Cuenta[] cuentas;
    private int contCuenta;
    public Cliente(String cedula,String nombres){
        this.cedula=cedula;
        this.nombres=nombres;
        cuentas = new Cuenta[3];
    }    
    public void agregarCuenta(Cuenta cuenta){

        if(contCuenta<3){
            cuentas[contCuenta++]=cuenta;
            cuenta.setCliente(this);
        }else{
            System.out.println("Ha superado el nro de cuentas establecido");
        }
    }
    public void ingresarDinero(String nCuenta,double cantidad){
        for(int i=0;i<3;i++){
            if(nCuenta.equalsIgnoreCase(cuentas[i].getNro())){
                cuentas[i].depositar(cantidad);
                break;
            }
            else{
                System.out.println("Cuenta No existe");
            }
        }
    }
    public void retirarDinero(String nCuenta,double cantidad){
        for(int i=0;i<3;i++){
            if(nCuenta.equalsIgnoreCase(cuentas[i].getNro())){
                cuentas[i].retirar(cantidad);
                break;
            }
            else{
                System.out.println("Cuenta No existe");
            }
        }
    }
    public void verCuentas(){
        for(int i=0;i<3;i++){
            System.out.println(cuentas[i]);
        }
    }
}
