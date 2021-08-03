
package dominio;


public class Operacion {
    private int n;
    public int factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac = fac*i;
        }
        return fac;
    }
}
