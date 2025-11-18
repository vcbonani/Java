class Carro{
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	void liga(){ //liga o carro
		System.out.println("O carro esta ligado");
	}
	void acelera(double quantidade){ //acelera uma certa quantidade
		this.velocidadeAtual += quantidade;
	}
	int pegaMarcha(){ //devolve a marcha do carro
		if(this.velocidadeAtual < 0){
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
			return 1;
		}
		if(this.velocidadeAtual >=40 && this.velocidadeAtual < 80){
			return 2;
		}
		return 3;
	}
}

class Motor{
	int potencia;
	String tipo;
}

class TestaCarro{
	public static void main(String[] args){
		Carro meuCarro = new Carro();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		meuCarro.liga();
		meuCarro.acelera(60);
		System.out.println("Velocidade: " + meuCarro.velocidadeAtual + " km/h. Marcha: " + meuCarro.pegaMarcha() + ".");
	}
}