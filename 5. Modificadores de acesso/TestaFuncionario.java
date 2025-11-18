class TestaFuncionario{
    public static void main(String[] args){
        Empresa alura = new Empresa();             //instancia uma Empresa chamada alura
        alura.setFuncionarios(10); //dentro da instancia alura, eu crio um vetor de 10 funcionários, portanto dentro da alura há 10 funcionarios
        Funcionario f1 = new Funcionario();
		f1.setNome("John");
		f1.setDepartamento("TI");
		f1.setSalario(2500);
		alura.adicionar(f1);
		Funcionario f2 = new Funcionario();
		f2.setNome("Jailson");
		f2.setDepartamento("Contabilidade");
		f2.setSalario(2700);
		alura.adicionar(f2);
		alura.mostraFuncionarios();
		alura.mostraTodasAsInformacoes();
		Funcionario f3 = new Funcionario();
		f3.setNome("Jailson");
		f3.setDepartamento("Contabilidade");
		f3.setSalario(2700);
		if(alura.contem(f3)){
			System.out.println("Funcionario ja existe");
		}else{
			System.out.println("Funcionario nao existe");
		}
    }
}