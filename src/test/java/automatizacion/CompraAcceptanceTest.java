package automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraAcceptanceTest {

    @Test
    void clienteObtieneDespachoGratisAlSuperarMontoMinimo() {

        CompraService compraService = new CompraService();

        String resultado = compraService.procesarCompra(20000, 3);

        assertEquals(
            "Compra aprobada con despacho gratis",
            resultado
        );
    }
}