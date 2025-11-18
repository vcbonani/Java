class Empresa{
    String nome;
    String cnpj;
    String endereco;
    Funcionario[] funcionarios;
    void adicionar(Funcionario f){
        for(int i = 0 ; i < this.funcionarios.length ; i++){
			Funcionario funcionario = this.funcionarios[i];
			if (funcionario == null){
				this.funcionarios[i] = f;
				System.out.println("/**********************************/");
				System.out.println("Funcionario " + this.funcionarios[i].nome + " adicionado com matricula " + i);
				break;
			}else{
				if(i == this.funcionarios.length - 1){
					System.out.println("/**********************************/");
					System.out.println("Quadro de funcionarios cheio");
				}
			}
		}
    }
	void mostraFuncionarios(){
		for(int i = 0; i < this.funcionarios.length ; i++){
			if(this.funcionarios[i] != null){
				System.out.println("/**********************************/");
				System.out.println("Matricula: " + i + " | Salario: " + this.funcionarios[i].salario);
			}
		}
	}
	void mostraTodasAsInformacoes(){
		for(Funcionario f: this.funcionarios){
			if(f != null){
				f.mostra();
			}
		}
	}
	boolean contem(Funcionario f){
		for(int i = 0; i < this.funcionarios.length ; i++){
			if(this.funcionarios[i] != null){
				if(f == this.funcionarios[i]){
					return true;
				}
			}
		}
		return false;
	}
}

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
		System.out.println("/**********************************/");
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
        Empresa alura = new Empresa();             //instancia uma Empresa chamada alura
        alura.funcionarios = new Funcionario[10];  //dentro da instancia alura, eu crio um vetor de 10 funcionários, portanto dentro da alura há 10 funcionarios
        Funcionario f1 = new Funcionario();
		f1.nome = "John";
		f1.departamento = "TI";
		f1.salario = 2500;
		alura.adicionar(f1);
		Funcionario f2 = new Funcionario();
		f2.nome = "Jailson";
		f2.departamento = "Contabilidade";
		f2.salario = 2700;
		alura.adicionar(f2);
		alura.mostraFuncionarios();
		alura.mostraTodasAsInformacoes();
		Funcionario f3 = new Funcionario();
		f3.nome = "Jailson";
		f3.departamento = "Contabilidade";
		f3.salario = 2700;
		if(alura.contem(f3)){
			System.out.println("Funcionario ja existe");
		}else{
			System.out.println("Funcionario nao existe");
		}
    }
}