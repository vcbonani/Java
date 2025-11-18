public class Empresa{
    private String nome;
    private String cnpj;
    private String endereco;
    private Funcionario[] funcionarios;
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setCNPJ(String cnpj){
		this.cnpj = cnpj;
	}
	public String getCNPJ(){
		return this.cnpj;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public void setFuncionarios(int i){
		this.funcionarios = new Funcionario[i];
	}
    public void adicionar(Funcionario f){
        for(int i = 0 ; i < this.funcionarios.length ; i++){
			Funcionario funcionario = this.funcionarios[i];
			if (funcionario == null){
				this.funcionarios[i] = f;
				System.out.println("/**********************************/");
				System.out.println("Funcionario " + this.funcionarios[i].getNome() + " adicionado com matricula " + i);
				break;
			}else{
				if(i == this.funcionarios.length - 1){
					System.out.println("/**********************************/");
					System.out.println("Quadro de funcionarios cheio");
				}
			}
		}
    }
	public void mostraFuncionarios(){
		for(int i = 0; i < this.funcionarios.length ; i++){
			if(this.funcionarios[i] != null){
				System.out.println("/**********************************/");
				System.out.println("Matricula: " + i + " | Salario: " + this.funcionarios[i].getSalario());
			}
		}
	}
	public void mostraTodasAsInformacoes(){
		for(Funcionario f: this.funcionarios){
			if(f != null){
				f.getFuncionario();
			}
		}
	}
	public boolean contem(Funcionario f){
		for(int i = 0; i < this.funcionarios.length ; i++){
			if(this.funcionarios[i] != null){
				if(f == this.funcionarios[i]){
					return true;
				}
			}
		}
		return false;
	}
}