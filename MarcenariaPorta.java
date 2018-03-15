import javax.sound.sampled.Port;

public class MarcenariaPorta {
	public static void main(String[] args) {
		
		Porta porta = new Porta();
		
		porta.cor = "branco";
		porta.dimensaoX = 50;
		porta.dimensaoY = 100;
		porta.dimensaoZ = 10;
		
		porta.abre();
		
		porta.pinta("Amarelo");
		porta.pinta("Verde");
		porta.pinta("Marrom");
		
		porta.dimensaoX = 1000;
		porta.dimensaoY = 12;
		porta.dimensaoZ = 5;
		
		porta.imprimeDadosPorta();
		
	}
}
