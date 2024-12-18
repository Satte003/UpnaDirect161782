package upnadirect;


public class VistaFalsa implements IVista{
    private final int anioNacimiento;
    private final int salario;
    private final String tipoBien;
    private final int valorBien;
    
    public VistaFalsa(Integer anioNacimiento, Integer salario, String tipoBien, Integer valorBien){
        this.anioNacimiento=anioNacimiento;
        this.salario=salario;
        this.tipoBien=tipoBien;
        this.valorBien=valorBien;
    }

    @Override
    public Integer consultarAnioNacimiento(){
        return this.anioNacimiento;
    }

    @Override
    public Integer consultarsalario(){
        return this.salario;
    }

    @Override
    public String consultartipoBien(){
        return this.tipoBien;
    }

    @Override
    public Integer consultarvalorBien(){
        return this.valorBien;
    }
}
