public class Main {
    public static void main(String[] args) {
    Transporte vehiculo;

    System.out.println("Buenos días,\nDisponemos de los siguientes tipos de embalajes que se corresponden con los siguientes números de referencia:\n0 - Palet\n1 - Envoltorio de cartón\n2 - Caja de madera");
    System.out.println("----------------------------------------------------------------------");
    System.out.println("En el caso de los siguientes vehículos:");
    vehiculo = FactoriaTransportes.Vehiculo("Camion");
        System.out.println("El tipo de embalaje a emplear en la Bicicleta es el número: " + vehiculo.TipoEmbalaje(4F, 4F, 4F, 4F));
    vehiculo = FactoriaTransportes.Vehiculo("Bicicleta");
        System.out.println("El tipo de embalaje a emplear en el Camión es el número: " + vehiculo.TipoEmbalaje(1F,1F,1F, 1F));
    }
}