
public class MotoristaCarro {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.cor = "Preto";
		carro.modelo = "Voyage";
		carro.velocidadeAtual = 0;
		carro.velocidadeMaxima = 120;
		
		
		carro.liga();
		carro.acelera(121);
		
		int m = carro.pegaMarcha();
		
		
		if(carro.velocidadeAtual <= 120) {
			System.out.println(carro.velocidadeAtual + "\n\n" + "Marcha: " + m );
		}else {
			System.out.println("\n VOCÊ ESTÁ ACIMA DO LIMITE PERMITIDO EM TERRITÓRIO BRASILEIRO, REDUZA!" + "\n\n" + carro.velocidadeAtual + "\n\n" + "Marcha: " + m );
		}
		
		
		
	}
}
