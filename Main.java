public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Santiago", "Vargas", "10496");
        Velero velero1 = new Velero(capitan1, 100000.0, 0.0, 2019, 10.0, 5);
        velero1.validar();
        System.out.println("Costo del alquiler del velero: " + velero1.calcularMontoAlquiler());

        Capitan capitan2 = new Capitan("David", "Farfán", "55641");
        Yate yate1 = new Yate(capitan2, 150000.0, 0.0, 2021, 15.0, 6);
        yate1.validar();
        System.out.println("Costo del alquiler del yate: " + yate1.calcularMontoAlquiler());
    }
}
