package automatizacion;

public class Despacho {

    public boolean tieneDespachoGratis(int montoCompra) {
        return montoCompra >= 50000;
    }
}