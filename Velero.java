public class Velero extends Embarcacion implements Validacion {
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public void validar() {
        if (cantidadMastiles > 4) {
            System.out.println("El velero es grande.");
        } else {
            System.out.println("El velero es estándar.");
        }
    }
}

