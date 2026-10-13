package Model;

public class Coche {
    private String marca, modelo, color;
    private int velocidad, kilometros;
    private static int totalCoches;

    public Coche (){
        totalCoches++;
    }

    public Coche (String marca, String modelo, String color, int velocidad, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.kilometros = kilometros;
        totalCoches++;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public int getKilometros() {
        return this.kilometros;
    }

    public static int getTotalCoches() {
        return totalCoches;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int acelerar (int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error. No se puede acelerar con una cantidad negativa");
        } else if (cantidad == 0) {
            System.out.printf("El coche mantiene su velocidad: %dKm/h\n", this.velocidad);
        } else {
            this.velocidad += cantidad;
            System.out.printf("Acelerando... La velocidad actual del coche es: %dKm/h\n", this.velocidad);
        }
        return this.velocidad;
    }

    public int frenar(int cantidad) {
        if (cantidad <0) {
            System.out.println("Error. No se puede frenar con una cantidad negativa");
        } else if (cantidad == 0) {
            System.out.printf("El coche mantiene su velocidad: %dKm/h\n", this.velocidad);
        } else {
            this.velocidad -= cantidad;
            if (this.velocidad < 0) {
                this.velocidad = 0;
                System.out.printf("Has frenado. La velocidad actual es 0Km/h\n");
            } else {
                System.out.printf("Frenando... Su velocidad actual es de %dKm/h\n", this.velocidad);
            }
        }
        return this.velocidad;
    }

    public int conducir(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error. No se puede poner una cantidad negativa");
        } else if (cantidad == 0) {
            System.out.printf("El coche ha recorrido un total de %dKm\n", this.kilometros);
        } else {
            this.kilometros += cantidad;
            System.out.printf("Espero que haya tenido un buen viaje. El total de kilometros es: %dKm\n", this.kilometros);
        }
        return this.kilometros;
    }

    public static void registrarCocheExterno() {
        totalCoches++;
    }

}
