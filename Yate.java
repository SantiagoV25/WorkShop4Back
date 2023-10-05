public class Yate extends Embarcacion implements Validacion {
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public void validar() {
        if (cantidadCamarotes > 7) {
            System.out.println("El yate es de lujo.");
        } else {
            System.out.println("El yate es estándar.");
        }
    }
}
