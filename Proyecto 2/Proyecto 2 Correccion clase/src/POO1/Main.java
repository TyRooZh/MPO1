package POO1;

public class Main {
    public static void main(String[] args) {
        //¿Como crear un objeto?
        //Nombre de la clase + nombre del objeto = new + nombre del constructor();
        //nombre del constructor = nombre de la clase

        Cuenta c1 = new Cuenta("Sandra", "ES4864319", 1.45, 1000);

        System.out.println(c1.getNombreCliente());

        /*
        Cuenta c1 = new Cuenta();
        String nombre;
        nombre = c1.getNombreCliente();

        System.out.Println(nombre);
         */
        c1.setNombreCliente("Leyre");
        System.out.println(c1.getNombreCliente());
        c1.setNombreCliente("Mario");
        System.out.println(c1.getNombreCliente());

    }
}
