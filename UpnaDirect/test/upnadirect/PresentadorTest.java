package upnadirect;

import static org.junit.Assert.*;
import org.junit.Test;

public class PresentadorTest {

    @Test
    public void testTratarCliente() {
        IVista vista = new VistaFalsa(2005, 15000, "vehiculo", 30000);
        Presentador presentador = new Presentador(vista);
        presentador.admitirCliente();
        // Aquí tendrías que redirigir la salida estándar para capturar el texto impreso
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        presentador.tratarCliente();

        String expected = "LINEA INDIRECTA | 900 | 9\n";
        assertEquals(expected, out.toString());
    }
}
