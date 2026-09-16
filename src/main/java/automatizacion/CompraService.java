package automatizacion;

public class CompraService {

    private Despacho despacho;

    public CompraService() {
        this.despacho = new Despacho();
    }

    public String procesarCompra(int precioProducto, int cantidad) {

        int totalCompra = precioProducto * cantidad;

        if (despacho.tieneDespachoGratis(totalCompra)) {
            return "Compra aprobada con despacho gratis";
        }

        return "Compra aprobada con despacho pagado";
    }
}