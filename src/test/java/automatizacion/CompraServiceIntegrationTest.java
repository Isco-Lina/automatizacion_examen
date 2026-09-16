package automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraServiceIntegrationTest {

    @Test
    void compraCompletaConDespachoGratis() {

        CompraService compraService = new CompraService();

        String resultado = compraService.procesarCompra(15000, 4);

        assertEquals(
            "Compra aprobada con despacho gratis",
            resultado
        );
    }

    @Test
    void compraCompletaConDespachoPagado() {

        CompraService compraService = new CompraService();

        String resultado = compraService.procesarCompra(10000, 3);

        assertEquals(
            "Compra aprobada con despacho pagado",
            resultado
        );
    }
}