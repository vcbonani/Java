public class DataEntra{
    private int dia;
    private int mes;
    private int ano;
    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String getFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}