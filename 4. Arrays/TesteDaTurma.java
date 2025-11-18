class Turma{
	Aluno[] alunos;
	void imprimeNotas(){
		for(int i = 0; i < this.alunos.length; i++){ //length diz o tamanho do array
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue; //passa para o próximo passo se o objeto for nulo, não existir
			System.out.println(aluno.nota);
		}
	}
}

class Aluno{
	String nome;
	int nota;
}

class TesteDaTurma{
	public static void main(String[] args){
		/*int[] notas = new int[10]; //cria um array de dez espaços de int na memória
		notas[0] = 9; //inicia sempre no zero*/
		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Mauricio";
		fj11.alunos[0].nota = 9;
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "Marcelo";
		fj11.alunos[1].nota = 5;
		
		fj11.alunos[2] = new Aluno();
		fj11.alunos[2].nome = "Jeremias";
		fj11.alunos[2].nota = 7;
		
		fj11.imprimeNotas();
	}
}

//em um array eu não posso apontar para um número maior do que o limite estabelecido
//preciso iniciar um array antes de referenciar uma posição
//variável primitiva é null por padrão