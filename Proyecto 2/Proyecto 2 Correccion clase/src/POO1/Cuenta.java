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
        this.nombreCliente = "Pepe";
        this.numeroCuenta = "ES98683203";
        this.tipoInteres = 543;
        this.saldo = 794.5;
    }

    // Constructor copia

    public Cuenta(Cuenta c) {
        this.nombreCliente = c.nombreCliente;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo;
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

    public boolean ingreso(double cantidad) {
        boolean resultado = true;
        if (cantidad < 0) {
            resultado = false;
        } else {
            this.saldo+=cantidad; //this.saldo = this.saldo + cantidad
        }
        return resultado;
    }

    public boolean reintegro(double cantidad) {
        boolean resultado = true;
        if (cantidad < 0 || cantidad > this.saldo) {
            //OR: true + false -> true; true + true -> true; false + false -> false; ||
            //AND: true + true -> true; true + false -> false; flase + false -> false; &&
            resultado = false;
        } else {
            this.saldo-=cantidad; // this.saldo = this.saldo - cantidad;
        }
        return resultado;
    }

    public boolean transferencia(Cuenta c, double dinero) {
        boolean resultado = true;
        if(dinero <0 || dinero > this.saldo) {
            resultado = false;
        } else {
            reintegro(dinero);
            c.ingreso(dinero);
        }
        return resultado;
    }

}
