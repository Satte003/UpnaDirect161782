package upnadirect;

import java.util.Scanner;

public class Vista implements IVista{
    private final Scanner scan = new Scanner(System.in);
    private final Scanner scanString = new Scanner(System.in);

    @Override
    public Integer consultarAnioNacimiento(){
        System.out.println("//Año de nacimiento (1900-2024): ");
        return scan.nextInt();
    }

    @Override
    public Integer consultarsalario(){
        System.out.println("//Salario: ");
        return scan.nextInt();
    }

    @Override
    public String consultartipoBien(){
        System.out.println("//Tipo de bien (vehiculo o vivienda): ");
        return scanString.nextLine();
    }

    @Override
    public Integer consultarvalorBien(){
        System.out.println("//Valor del bien: ");
        return scan.nextInt();
    }
}
