package upnadirect;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testValidarClienteAnioNacimiento() {
        Cliente cliente = new Cliente(2000, 15000, "vehiculo", 30000);
        assertTrue(cliente.calcularEdad() >= 0);
    }

    @Test
    public void testValidarClienteSalario() {
        Cliente cliente = new Cliente(2000, 15000, "vehiculo", 30000);
        assertTrue(cliente.getSalario() >= 0);
    }
}
