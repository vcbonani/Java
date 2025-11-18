public class DataEntra{
    private int dia;
    private int mes;
    private int ano;
	public DataEntra(int dia, int mes, int ano){
		if (this.validaData(dia, mes, ano)){
			this.setData(dia, mes, ano);
			this.getFormatada();
		}else{
			System.out.println("Formato de data inválido");
		}
	}
	/*public DataEntra(){
		
	}*/
    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //public String getFormatada(){
	public void getFormatada(){
        //this.dia + "/" + this.mes + "/" + this.ano;
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
	public boolean validaData(int dia, int mes, int ano){
		if (dia > 0 && dia < 32){
			if (mes > 0 && mes < 13){
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 31)){
					return true;
				}
				if ((mes == 2) && (dia < 30)){
					return true;
				}
				if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12) && (dia < 32)){
					return true;
				}
			}
		}
		return false;
	}
}