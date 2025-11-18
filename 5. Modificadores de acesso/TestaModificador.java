//regra de negócio nunca fica no main mas na classe
//private - encapsulamento, esconder regra dentro da classe
//encapsulamento evita repetição de código
//modificador de acesso: private e public
//private -> atributos
//public -> comportamentos, métodos
//não criar setters e getters para tudo

class Conta{
	int numero;
	Cliente titular;
	private double saldo; //o private diz que o atributo só pode ser alterado pela própria classe
	//o private restringe gravação e leitura, para imprimir o atributo tem que criar um método
	private double limite;
	public void saca(double valor){
		if(valor > this.saldo + this.limite){
			System.out.println("Saque invalido");
		}else{
			this.saldo = this.saldo - valor;	
		}
	}
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	//getters = get + atributo -> mostra
	public double getSaldo(){
		return this.saldo;
	}
	//setters = set + atributo -> grava
	public void setLimite(double novoLimite){
		this.limite = novoLimite;
	}
}

class Cliente{
	String nome;
	String endereco;
}

class TestaModificador{
	public static void main(String args[]){
		
		Conta joao = new Conta();
		joao.numero = 123;
		joao.setLimite(100);

		joao.deposita(500);
		
		double valorASerSacado = 600;
		joao.saca(valorASerSacado);
		
		//joao.saldo -= 100; -> quando atributo tem private não pode fazer isso
		
		System.out.println(joao.getSaldo());
		
	}
}