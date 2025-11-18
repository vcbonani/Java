class variaveisFluxo{

	public static void main(String[] args){
		
		int idade = 15;
		System.out.println("Idade: " + idade);
		
		//comentário
		/* comentário
		
		eeee*/
				
		int idadeNoAnoQueVem;
		idadeNoAnoQueVem = idade + 1;
		boolean amigoDoDono = true;
		System.out.println("Idade no ano que vem: " + idadeNoAnoQueVem);
		
		if (idade >= 18 || amigoDoDono == true){
			System.out.println("Pode entrar");
		}else{
			System.out.println("Não pode entrar");
		}
		
		while (idade < 18){
			System.out.println("Idade no while: " + idade);
			idade++;
		}
		
		System.out.println("Tabuada do 2:");
		for(int contador = 1; contador <= 10; contador++){
			System.out.println("2 X " + contador + " = " + (contador * 2));
		}
		
		int quatro = 2 + 2;
		int tres = 5 - 2;
		int oito = 4 * 2;
		int dezesseis = 64 / 4;
		int um = 5 % 2; //5 dividido por 2 dá 2 e tem resto 1. O operador % pega o resto da divisão inteira
		System.out.println("Quatro: " + quatro + " Tres: " + tres + " Oito: " + oito + " Dezesseis: " + dezesseis + " Um: " + um);
		
		double pi = 3.14;
		double x = 5 * 10;
		boolean verdade = true;
		boolean menorDeIdade = idade < 18;
		char letra = 'a';
		System.out.println("Pi: " + pi + " X: " + x + " Verdade: " + verdade + " Menor de idade? " + menorDeIdade + " Letra: " + letra);
		
		int i = 5;
		int j = i;
		i = i + 1;
		System.out.println("i: " + i + " j: " + j);
		
		int i2 = 5;
		double d2 = i2; //de double diretamente pra int não pode. int pra double pode
		double d3 = 3.14;
		int i3 = (int) d3; //casting double para int
		long x2 = 1000;
		int i4 = (int) x2; //casting long para int
		System.out.println("i2:" + i2 + " d2:" + d2 + " d3:" + d3 + " i3:" + i3 + " x2:" + x2 + " i4:" + i4);
		
		
		
	}

}