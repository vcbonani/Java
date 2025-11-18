/*
Espaço de memória aonde a Conta e Pessoa é armazenado: HEAP
mauricio é uma referencia de Conta (aponta para um objeto na memória)
Conta aponta para um outro objeto na memória
O objeto é uma conta propriamente dita com valores e etc
Classe possui atributos e métodos de um objeto
*/

class Conta{
	
	int numero;
	Pessoa titular;
	double saldo;
	int agencia;
	
	void imprimeSaldo(String operacao){
		System.out.println("Saldo do " + this.titular.nome + "" + operacao + ": " + this.saldo);
	}
	
	void deposita(double valorASerDepositado){
	//o void diz que o método não retorna nada
		this.saldo += valorASerDepositado;
		//o this deixa claro que a variável saldo se refere apenas a classe Conta
		this.imprimeSaldo(" apos deposito");
	}
	
	void saca(double valorASerSacado){
		if (this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
		this.imprimeSaldo(" apos saque");
	}
	
	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo +=valor;
	}
	
}

class Pessoa{
	
	String nome;
	String cpf;
	String dataNascimento;
	
}

class Programa{
	
	public static void main(String[] args){
	
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.0;
		mauricio.titular = new Pessoa();
		mauricio.titular.nome = "Mauricio Manieri";
		mauricio.agencia = 842;
		mauricio.imprimeSaldo("");
		mauricio.deposita(100.0);
		mauricio.saca(500.0);
		
		Conta vinicius = new Conta();
		vinicius.numero = 432;
		vinicius.saldo = 1200.0;
		vinicius.titular = new Pessoa();
		vinicius.titular.nome = "Vinicius Eu";
		vinicius.agencia = 987;
		vinicius.imprimeSaldo("");
		vinicius.deposita(100.0);
		vinicius.saca(30.0);
		
		mauricio.transfere(200.0, vinicius);
		mauricio.imprimeSaldo(" apos transferir 200.0");
		vinicius.imprimeSaldo(" apos receber 200.0");
		
	}
	
}