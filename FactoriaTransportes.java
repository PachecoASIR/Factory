public abstract class FactoriaTransportes {
    public static Transporte Vehiculo(String type) {
       if (type == "Camion"){
            return new Camion();
        }
       else if (type == "Bicicleta") {
           return new Bicicleta();
       }
       else{
           return new Barco();
            }
        }
    }
