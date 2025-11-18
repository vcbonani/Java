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