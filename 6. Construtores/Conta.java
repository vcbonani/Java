class Conta{
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	
	public Conta(int numero, double limite){
		this(numero, limite, 0);
	}
	
	public Conta(int numero, double limite, double saldoInicial){
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;
	}
	
	
	//construtor padrão
	public Conta(){
		
	}
	
	
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