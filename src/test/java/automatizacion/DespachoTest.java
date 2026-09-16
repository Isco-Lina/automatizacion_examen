package automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DespachoTest {

    @Test
    void compraConDespachoGratis() {

        Despacho despacho = new Despacho();

        boolean resultado = despacho.tieneDespachoGratis(60000);

        assertTrue(resultado);
    }

    @Test
    void compraSinDespachoGratis() {

        Despacho despacho = new Despacho();

        boolean resultado = despacho.tieneDespachoGratis(30000);

        assertFalse(resultado);
    }
}