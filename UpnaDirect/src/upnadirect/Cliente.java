package upnadirect;


public class Cliente {
    private int anioNacimiento;
    private int salario;
    private String tipoBien;
    private int valorBien;

    public Cliente (int anioNacimiento, int salario, String tipoBien, int valorBien){
        this.anioNacimiento = anioNacimiento;
        this.salario = salario;
        this.tipoBien = tipoBien;
        this.valorBien = valorBien;
    }
    
    

    public int calcularEdad (){
        return(2024-anioNacimiento);
    }

    public double importeMafro (){
        if(tipoBien.equals("vehiculo") && calcularEdad()<20){
            return (valorBien*0.05);
        } else if (tipoBien.equals("vivienda") && valorBien>200000 && salario<20000){
            return(valorBien*0.02);
        } else {
            return(valorBien*0.03);
        }
    }

    public double importeLineaIndirecta (){
        if((tipoBien.equals("vehiculo") && valorBien <20000) || (tipoBien.equals("vivienda") && valorBien <150000)){
            return (valorBien*0.04);
        } else if (tipoBien.equals("vehiculo") && valorBien>=20000 && calcularEdad()>60){
            return(valorBien*0.06);
        } else {
            return(valorBien*0.03);
        }
    }

    public double importeAdasles (){
        if(tipoBien.equals("vehiculo") && (calcularEdad()<20 || calcularEdad()>60)){
            return (valorBien*0.06);
        } else {
            return(valorBien*0.02);
        }
    }

    public int comisionMafro(){
        double importe = importeMafro();

        if(importe<1000){
            return (int) (importe*0.01);
        } else {
            return (int) (importe*0.03);
        }
    }

    public int comisionLineaIndirecta(){
        double importe = importeLineaIndirecta();

        if(importe<1000){
            return (int) (importe*0.01);
        } else {
            return (int) (importe*0.04);
        }
    }

    public int comisionAdasles(){
        double importe = importeAdasles();

        if(importe<1000){
            return (int) (importe*0.01);
        } else {
            return (int) (importe*0.05);
        }
    }
    
    public int getSalario() {
        return salario;
    }

    public String getTipoBien() {
        return tipoBien;
    }

    public int getValorBien() {
        return valorBien;
}
 
}
    
