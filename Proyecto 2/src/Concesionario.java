import Model.Coche;

public class Concesionario {
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.acelerar (30);
        coche1.acelerar (20);
        coche1.frenar (40);
        coche1.frenar (20);
        coche1.acelerar (50);
        coche1.conducir (100);
        coche1.conducir (20);
        System.out.printf("La marca del primer coche es %s, su modelo es %s y tiene un color %s. Su velocidad actual es %dKm/h y tiene unos %dKm\n", coche1.getMarca(), coche1.getModelo(), coche1.getColor(), coche1.getVelocidad(), coche1.getKilometros());
        System.out.println("");

        Coche coche2 = new Coche("Toyota", "Corolla", "Blanco", 0, 12000);

        coche2.acelerar (50);
        coche2.acelerar (60);
        coche2.acelerar (100);
        coche2.frenar (120);
        coche2.frenar (-120);
        coche2.conducir (200);
        System.out.printf("La marca del segundo coche es %s, su modelo es %s y tiene un color %s. Su velocidad actual es %dKm/h y tiene unos %dKm\n", coche2.getMarca(), coche2.getModelo(), coche2.getColor(), coche2.getVelocidad(), coche2.getKilometros());
        System.out.println("");

        Coche coche3 = new Coche("Audi", "A7", "Negro", 0, 30000);

        coche3.frenar (30);
        coche3.acelerar (200);
        coche3.frenar (50);
        coche3.conducir (300);
        coche3.setColor ("Gris");
        System.out.printf("La marca del tercer coche es %s, su modelo es %s y tiene un color %s. Su velocidad actual es %dKm/h y tiene unos %dKm\n", coche3.getMarca(), coche3.getModelo(), coche3.getColor(), coche3.getVelocidad(), coche3.getKilometros());
        System.out.println("");
        System.out.printf("El total de coches en el concesionario es %d\n", Coche.getTotalCoches());
        System.out.println("");

        Coche.registrarCocheExterno();
        Coche.registrarCocheExterno();
        Coche.registrarCocheExterno();
        Coche.registrarCocheExterno();
        Coche.registrarCocheExterno();
        Coche.registrarCocheExterno();
        Coche.registrarCocheExterno();
        System.out.printf("El total de coches en el concesionario es %d\n", Coche.getTotalCoches());

    }
}
