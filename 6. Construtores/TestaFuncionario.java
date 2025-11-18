class TestaFuncionario{
    public static void main(String[] args){
        DataEntra dataEntrada1 = new DataEntra(29,2,2012);
		DataEntra dataEntrada2 = new DataEntra(31,2,2012);
		DataEntra dataEntrada3 = new DataEntra(30,0,2012);
		DataEntra dataEntrada4 = new DataEntra(30,1,2012);
		DataEntra dataEntrada5 = new DataEntra(32,3,2012);
		DataEntra dataEntrada6 = new DataEntra(0,5,2012);
		
		Empresa alura = new Empresa(10); //uso do construtor para passar o tamanho do array
        Funcionario f1 = new Funcionario("John");
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