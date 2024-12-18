package upnadirect;

public class UpnaDirect {
    public static void main(String[] args) {
        Presentador presentador = new Presentador(
            new Vista());

        presentador.admitirCliente();
        presentador.tratarCliente();
        
    }
    
}
