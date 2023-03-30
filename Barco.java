public class Barco implements Transporte{
    @Override
    public float CosteTotal(Integer cp) {
        return 0;
    }

    public int TipoEmbalaje(Float x, Float y, Float z, Float peso) {
        int TipoEmbalaje;
        if (x < 1 && y < 1 && peso < 1) {
            TipoEmbalaje = 0;
        } else if (x < 3 && y < 3 && peso < 3) {
            TipoEmbalaje = 1;
        }else{
            TipoEmbalaje = 2;
        }
        return TipoEmbalaje;
    }
}