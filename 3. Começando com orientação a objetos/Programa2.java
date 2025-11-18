class Conta{ //classe
	
	int numero; //atributos. Todo novo atributo inicia com 0 (int) e boolean com false e objeto com null
	Cliente titular; //é necessário instanciar Cliente no meu código principal
	//Cliente titular = new Cliente(); //não será necessário instanciar Cliente no meu código principal
	double saldo;
	double limite;
	
	//métodos
	boolean saca(double quantidade){ //void não retorna nada, boolean retorna true ou false
		if(this.saldo < quantidade){
			return false; //return indica que o método termina aqui e retorna a informação para o código que o chamou
		}else{
			this.saldo -= quantidade;
			return true;
		}
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	boolean transferePara(Conta destino, double valor){
		if(this.saca(valor)){
			destino.deposita(valor);
			return true;
		}else{
			return false;
		}
	}
	
}

class Cliente{
	String nome;
	String sobrenome;
	String cpf;
}

class Programa2{
	
	public static void main(String[] args){
		
		Conta minhaConta = new Conta(); //minhaConta é uma referência a um objeto da classe Conta. Pode haver outras referências de objetos de Conta
		minhaConta.titular = new Cliente();
		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000.0;
		System.out.println("Saldo atual: " + minhaConta.saldo);
		minhaConta.saca(200);
		System.out.println("Saldo atual: " + minhaConta.saldo);
		minhaConta.deposita(500);
		System.out.println("Saldo atual: " + minhaConta.saldo);
		if (minhaConta.saca(2000)){
			System.out.println("Consegui sacar");
		}else{
			System.out.println("Nao consegui sacar");
		}
		
		Conta c1 = new Conta();
		c1.deposita(100);
		Conta c2 = c1; //c2 faz referência ao mesmo objeto que c1
		c2.deposita(200);
		System.out.println("c1=" + c1.saldo + " c2=" + c2.saldo);
		
		if(minhaConta.transferePara(c1,50)){
			System.out.println("Transferi. Saldo de minha Conta: " + minhaConta.saldo + ". Saldo de c1: " + c1.saldo);
		}else{
			System.out.println("Não consegui transferir");
		}
		
		
	}
	
}