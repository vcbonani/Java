public class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    DataEntra dataEntrada = new DataEntra();
    private String rg;
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setDataEntrada(DataEntra dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	public DataEntra getDataEntrada(){
		return this.dataEntrada;
	}
	public void setRG(String rg){
		this.rg = rg;
	}
	public String getRG(){
		return this.rg;
	}
    public void setAumento(double aumento){
        this.salario += aumento;
    }
    public double getGanhoAnual(){
        return this.salario * 12;
    }
    public void getFuncionario(){
		System.out.println("/**********************************/");
        System.out.println("Dados do funcionario");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
        System.out.println("RG: " + this.getRG());
    }
}