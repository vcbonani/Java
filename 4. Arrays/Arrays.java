class Conta{
	double saldo;
}

class Arrays{
	public static void main(String[] args){
		//o método main recebe array de Strings como argumento
		for(String argumento: args){
			System.out.println(argumento);
		}
		
		int numero[] = new int[0]; //deixa compilar
		/*int numero2[] = new int [-1]; //dá erro*/
		
		int[] idades; //declara int como vetor
		idades = new int[10]; //cria objeto-array, no caso de 10 posições
		//No java o array inicia na posição 0 e vai até n-1
		idades[0] = 5;
		idades[1] = 10;
		System.out.println("0 = " + idades[0] + " 1 = " + idades[1]);
		
		int numerosDoBilhete[] = new int[10]; //declarar assim é o mesmo que juntar as linhas 7 e 8
		numerosDoBilhete[0] = 100;
		System.out.println(numerosDoBilhete[0]);
		
		Conta[] minhasContas;
		minhasContas = new Conta[10];
		//crio um array de um objeto
		minhasContas[0] = new Conta();
		minhasContas[0].saldo = 3200;
		minhasContas[1] = new Conta();
		minhasContas[1].saldo = 1500;
		System.out.println("Array objeto " + minhasContas[0].saldo + " " + minhasContas[1].saldo);
		
		//array não pode mudar de tamanho
		//array de tipos primitivos (int) guarda valores, array de objetos guarda referências
		
		int[] contas = new int[10];
		for (int i = 0; i < 10 ; i++){
			contas[i] = i * 10;
		}
		/*for (int i = 0 ; i < contas.length ; i++){ //length pega o tamanho do array
			System.out.println(contas[i]);
		} */
		for (int x : contas){ //uso do enhanced-for para imprimir um array
			System.out.println(x);
		}
		
		//array bidimensional, matriz
		int[][] matriz = new int[3][2];
		for(int linha=0; linha < 3; linha++){
			for(int coluna=0; coluna < 2; coluna++){
				matriz[linha][coluna] = linha + coluna;
			}
		}
		for(int linha=0; linha < 3; linha++){
			for(int coluna=0; coluna < 2; coluna++){
				System.out.println(matriz[linha][coluna]);
			}
		}
		
	}
}