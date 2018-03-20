

public class Conta {
	private int numero;
	private double saldo;
	private String titular;
	private String dataAbertura;
	private static int identificador;
	
	public Conta(String nome) {
		Conta.identificador += 1;
		this.titular = nome;
	}
	public Conta() {
		Conta.identificador += 1;
	}
	
	//M�todos
	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	boolean transferePara(Conta destino, double valor) {

		boolean retirou = this.saca(valor);
		if(retirou == false) {
			return false;
		}else {
			destino.deposita(valor);
			return true;
		}	
	}
	
	public void imprimeDadosConta() {
		System.out.println("N�mero: " + numero + "\n" + 
						   "Saldo: " + saldo + "\n" +
						   "Titular: " + titular + "\n" +
						   "Data de Abertura da Conta: " + dataAbertura + "\n" );
		
	}
		
	//Getters and Setters
	
	//Titular
	public String getTitular() {
		return this.titular;
	}
	
	public String setTitular(String nome) {
		return this.titular = nome;
	}
	
	//Saldo
	public double getSaldo() {
		return this.saldo;
	}
	
	//Identificador
	public int getIdentificador() {
		return identificador;
	}
	
	//DataAbertura
	public String getDataAbertura() {
		return this.dataAbertura;
	}
	
	public String setDataAbertura(String data) {
		return this.dataAbertura = data;
	}
	
	

	
}
