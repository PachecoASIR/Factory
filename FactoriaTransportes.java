public abstract class FactoriaTransportes {
    public static Transporte Vehiculo(String type) {
       if (type == "Camion"){
            return new Camion();
        }
        else{
            return new Bicicleta();
        }
    }
}
