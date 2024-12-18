package upnadirect;


import static org.junit.Assert.*;
import org.junit.Test;

public class BienTest {

    @Test
    public void testValidarTipoBien() {
        Cliente cliente = new Cliente(2000, 15000, "vehiculo", 30000);
        assertTrue(cliente.getTipoBien().equals("vehiculo") || cliente.getTipoBien().equals("vivienda"));
    }

    @Test
    public void testValidarValorBien() {
        Cliente cliente = new Cliente(2000, 15000, "vehiculo", 30000);
        assertTrue(cliente.getValorBien() > 0);
    }
}
