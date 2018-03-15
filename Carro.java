
public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	void liga() {
		System.out.println("O carro está ligado");
	}
	
	//Acelera uma certa quantidade
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	//Devolve a marcha do carro
	int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 20) {
			return 1;
		}
		if(this.velocidadeAtual >= 20 && this.velocidadeAtual < 40) {
			return 2;
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 3;
		}
			return 4;
	}	
	
}
