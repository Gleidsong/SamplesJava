
public class Porta {
	
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	void pinta(String s) {
		this.cor = s;
	}
	
	boolean estaAberta() {
		if(this.aberta == true) {
			return true; 
		}else {
			return false;
		}
		
	}
	
	void imprimeDadosPorta(){
		if(estaAberta() == true) {
			System.out.println("Status: Aberta");	
			}else {
				System.out.println("Status: Fechada");
			}
			System.out.println(
			"Cor: " + cor + "\n" +
			"Dimens�o X: " + dimensaoX + "\n" + 
			"Dimens�o Y: " + dimensaoY + "\n" + 
			"Dimens�o Z: " + dimensaoZ + "\n"  
			);
		}
	
}
