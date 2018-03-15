
public class Casa {
	
	String cor;
	int porta1 = 0;
	int porta2 = 0;
	int porta3 = 0;
	
	
	void pinta(String s) {
		this.cor = s;
	}
	
	int quantasPortasEstaoAbertas() {
		int qtd = porta1 + porta2 + porta3;
		return qtd;
	}
	
	void imprimeDadosCasa() {
		
		//Cor da prota
		System.out.println("Cor: " + cor);
		
		//Status da prota
		if(porta1 == 1) {
			System.out.println("Porta 1 - Aberta");
		}else {
			System.out.println("Porta 1 - Fechada");
		}
		if(porta2 == 1) {
			System.out.println("Porta 2 - Aberta");
		}else {
			System.out.println("Porta 2 - Fechada");
		}		
		if(porta3 == 1) {
			System.out.println("Porta 3 - Aberta");
		}else {
			System.out.println("Porta 3 - Fechada");
		}
		
		//Total de portas abertas
		System.out.println("Total de Portas abertas: " + quantasPortasEstaoAbertas());
		
	}
	
}
