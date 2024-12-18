package upnadirect;

import static org.junit.Assert.*;
import org.junit.Test;

public class OfertaTest {

    @Test
    public void testCalcularImporteMafro() {
        Cliente cliente = new Cliente(2005, 15000, "vehiculo", 30000);
        assertEquals(1500, cliente.importeMafro(), 0.01);
    }

    @Test
    public void testCalcularComisionMafro() {
        Cliente cliente = new Cliente(2005, 15000, "vehiculo", 30000);
        assertEquals(45, cliente.comisionMafro());
    }

    @Test
    public void testCalcularImporteLineaIndirecta() {
        Cliente cliente = new Cliente(2005, 15000, "vehiculo", 30000);
        assertEquals(900, cliente.importeLineaIndirecta(), 0.01);
    }

    @Test
    public void testCalcularComisionLineaIndirecta() {
        Cliente cliente = new Cliente(2005, 15000, "vehiculo", 30000);
        assertEquals(9, cliente.comisionLineaIndirecta());
    }

    @Test
    public void testCalcularImporteAdasles() {
        Cliente cliente = new Cliente(2005, 15000, "vehiculo", 30000);
        assertEquals(1800, cliente.importeAdasles(), 0.01);
    }

    @Test
    public void testCalcularComisionAdasles() {
        Cliente cliente = new Cliente(2005, 15000, "vehiculo", 30000);
        assertEquals(90, cliente.comisionAdasles());
    }
}
