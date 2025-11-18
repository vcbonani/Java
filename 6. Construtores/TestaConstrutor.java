//método construtor -> especial na hora de criar a classe, no momento do new
//nome do método tem que ser identico ao da conta e sem retorno (void, boolean, etc)
//é possível ter vários construtores em uma classe, mas as variáveis de parametro devem ser diferentes
//quando crio um, o padrão deixa de existir
//construtor garante que uma classe não seja criada em um estado inválido, faltando dado
//pode-se invocar um construtor a partir do outro

class TestaConstrutor{
	public static void main(String args[]){
		
		Conta joao = new Conta(123, 100.0);
		//se eu não passar os parametros o programa não compila
		//joao.numero = 123;
		//ao invés de ter que passar o atributo eu crio um construtor na minha classe Conta
		joao.setLimite(100);

		joao.deposita(500);
		
		double valorASerSacado = 600;
		joao.saca(valorASerSacado);
		
		System.out.println(joao.getSaldo());
		
	}
}