package POO1;

public class Cuenta {
    //ATRIBUTO: modificador de acceso (public/private/protected) + tipo + nombre + (valor)
    //public: se puede acceder a el fuera de la clase, fuera del paquete donde se cre y dentro de la clase
    //private: no se puede acceder a el fuera de su clase, peri se puede dentro de su clase

    /* Encapsulación:
    1. Atributos privados
    2. Metodos publicos getter y setter
     */
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por parametros
    //public + nombre de la clase + (parametros)

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(){

    }

    //Méto-do getter -> return
    /*
    * public + tipo + getNombreAtributo() {
    *   return + NombreAtributo;
    * }
    *
     */

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    /*
    *
    *  public + void + nombreMetodo(atributo) {
    *    this.nombreAtributo = nombreParametro;
    * }
    *
     */

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void setNombreCliente (String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTipoInteres (double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

}
