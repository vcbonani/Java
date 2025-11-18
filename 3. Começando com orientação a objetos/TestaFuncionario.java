// convenção de código: nomeDeAtributo, nomeDeMetodo, nomeDeVariavel, NomeDeClass

class Funcionario{
	String nome;
	String departamento;
	double salario;
	DataEntra dataEntrada = new DataEntra();
	String rG;
	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	public double calculaGanhoAnual(){
		return this.salario * 12;
	}
	public void mostra(){
		System.out.println("Dados do funcionario");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rG);
	}
}

class DataEntra{
	int dia;
	int mes;
	int ano;
	void preencheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class TestaFuncionario{
	public static void main(String[] args){
		//Funcionario.calculaGanhoAnual(); <- acessar assim diretamente não pode pois não há a referência do objeto criado
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		f1.mostra();
		
		if(f1==f2){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
		f1.nome = "Jailson";
		f1.departamento = "TI";
		f1.salario = 1500;
		f1.dataEntrada.preencheData(1,2,2003);
		f1.rG = "1234567890";
		
		f2.nome = "Jailson";
		f2.departamento = "TI";
		f2.salario = 1500;
		f2.dataEntrada = new DataEntra();
		f2.dataEntrada.preencheData(1,2,2003);
		f2.rG = "1234567890";
		
		if(f1==f2){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
		System.out.println("Salario do "+ f1.nome + " e de " + f1.salario);
		f1.recebeAumento(50);
		System.out.println(f1.nome + " recebeu aumento e seu salario agora e " + f1.salario);
		System.out.println("Seu ganho anual sera agora de " + f1.calculaGanhoAnual());
		f1.mostra();
		
		Funcionario f3 = f1;
		if(f1==f3){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		f1.nome = "Blastoise";
		f3.mostra();
	}
}