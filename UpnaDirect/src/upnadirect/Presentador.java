package upnadirect;

public class Presentador {
    private IVista vista;
    private Cliente cliente;

    public Presentador (IVista vista){
        this.vista = vista;
    }

    public void admitirCliente (){
        int anioN;
        int salario;
        String tipoB;
        int valorB;
        Boolean cumplido;

        do{
            anioN = vista.consultarAnioNacimiento();
            salario = vista.consultarsalario();
        } while (anioN < 1900 || anioN > 2024 || salario < 0);

        do{
            tipoB = vista.consultartipoBien();
            valorB =vista.consultarvalorBien();
            switch (tipoB) {
                case "vehiculo":
                    cumplido = valorB>0 && valorB<50000;
                    break;
                
                case "vivienda":
                    cumplido = valorB>50000;
                    break;
    
                default:
                    cumplido=false;
                    break;
            }
        } while (!cumplido);

        cliente = new Cliente(anioN,salario,tipoB,valorB);
    }

    public void tratarCliente (){
        int importeMafro = (int) cliente.importeMafro();
        int importeLineaIndirecta = (int) cliente.importeLineaIndirecta();
        int importeAdasles = (int) cliente.importeAdasles();
        int comisionMafro = cliente.comisionMafro();
        int comisionLineaIndirecta = cliente.comisionLineaIndirecta();
        int comisionAdasles = cliente.comisionAdasles();

        if(importeMafro<importeAdasles && importeMafro<importeLineaIndirecta){
            System.out.println("MAFRO | " + importeMafro + " | " + comisionMafro);
        } else if (importeLineaIndirecta<importeMafro && importeLineaIndirecta<importeAdasles){
            System.out.println("LINEA INDIRECTA | " + importeLineaIndirecta + " | " + comisionLineaIndirecta);
        } else if (importeAdasles<importeMafro && importeAdasles<importeLineaIndirecta){
            System.out.println("ADASLES | " + importeAdasles + " | " + comisionAdasles);
        } else if (importeMafro==importeLineaIndirecta && importeAdasles>importeMafro){
            if(comisionMafro>comisionLineaIndirecta){
                System.out.println("MAFRO | " + importeMafro + " | " + comisionMafro);
            } else {
                System.out.println("LINEA INDIRECTA | " + importeLineaIndirecta + " | " + comisionLineaIndirecta);
            }
        } else if (importeMafro==importeAdasles && importeLineaIndirecta>importeMafro){
            if(comisionMafro>comisionAdasles){
                System.out.println("MAFRO | " + importeMafro + " | " + comisionMafro);
            } else {
                System.out.println("ADASLES | " + importeAdasles + " | " + comisionAdasles);
            }
        } else if(importeLineaIndirecta==importeAdasles && importeMafro>importeLineaIndirecta){
            if(comisionLineaIndirecta>comisionAdasles){
                System.out.println("LINEA INDIRECTA | " + importeLineaIndirecta + " | " + comisionLineaIndirecta);
            } else {
                System.out.println("ADASLES | " + importeAdasles + " | " + comisionAdasles);
            }
        }
    }
}
