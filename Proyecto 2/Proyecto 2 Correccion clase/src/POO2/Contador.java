package POO2;

public class Contador {
    /*
    * 1. Atributos (propiedades o Variables de Estado)
    * 2. Metodos Constructores (y destructores, pero java no tiene)
    * 3. Getter y Setter (Metodos de Acceso/Modificacion)
    * 4. Metodos de Negocio / Comportamiento (Lógica principal)
    * 5. Metodos privados y auxiliares
      */
    private int cont;

    public Contador(int cont) {
        if (cont<0) {
            this.cont = 0;
        }else {
            this.cont = cont;
        }
    }

    public Contador() {

    }

    public Contador(Contador c) {
        this.cont = c.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont<0) {
            this.cont = 0;
        }else {
            this.cont = cont;
        }
    }

    public void incrementar() {
        this.cont++; //this.cont = this.cont +1;
    }

    public void decrementar() {
        this.cont--; // this.cont = this.cont -1;
        if (this.cont < 0) {
            this.cont = 0;
        }
    }
}
