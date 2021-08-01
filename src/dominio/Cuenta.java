
package dominio;


public class Cuenta {
    private String nro;
    private double saldo;
    Cliente cliente;

    public Cuenta(String nro, double saldo) {
        this.nro = nro;
        this.saldo = saldo;
    }
    public void setCliente(Cliente cl){
        this.cliente=cl;
    }

    public String getNro() {
        return nro;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void depositar(double cantidad){
            saldo+=cantidad;
    }
    public void retirar(double cantidad){
        if(this.saldo>=cantidad){
            this.saldo-=cantidad;
        }
        else{
            System.out.println("Saldo insuficiente su saldo es "+this.saldo);
        }
        
    }
    @Override
    public String toString(){
        return this.nro+"  "+this.saldo;
    }
}
