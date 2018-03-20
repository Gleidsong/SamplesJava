
import java.text.SimpleDateFormat;

public class Conta2 {
	String nome;
	int numero;
	String agencia;
	double saldo;
	DataAbertura dataAbertura = new DataAbertura();
	double valMaxDeposito;
	double valMaxTransf;
	String senha;
	
	void saca(double valor) {
		if(valor > saldo) {
			System.out.println("Detectamos um problema, por favor entrar em contato com a administradora do cart�o");
		}else {
			System.out.println("Saque autorizado!");
			this.saldo -= valor;	
		}
	}
	
	void deposita(double valor) {
		if(valor > valMaxDeposito) {
			System.out.println("Voc� atingiu o valor m�ximo permitido para dep�sito de: " + valMaxDeposito);
		}else {
			System.out.println("Dep�sito autorizado!");
			this.saldo += valor;
		}
	}
	
	double calculaRendimento(int meses) {	
		return (saldo * 0.1)*meses;
	}
	
	void extrato() {
		System.out.println("Saldo Atual: " + this.saldo);
	}
	
	void transferePara(Conta2 destino, double valor) {
		if(valor <= valMaxTransf) {
			if(valor >= saldo) {
				System.out.println("Saldo insuficiente \n\n");
			}else {
				System.out.println("Realizando Transfer�ncia...");
				destino.deposita(valor);
			}
		}else {
			System.out.println("Valor limite para transfer�ncia atingido \n\n");
		}
	  }
	
	void recuperarDadosParaImpressao() {
		
		//Formatar Data
		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/YYYY");
		String dataAberturaFormat = formatData.format(dataAbertura.calendario.getTime());
		
		System.out.println(
				"Cliente: " + nome + "\n" +
				"Conta: "+ numero + "\n" +
				"Ag�ncia: " + agencia + "\n" +
				"Saldo: " + saldo + "\n" +
				"Data de Abertura: " + dataAberturaFormat + "\n" +
				"Valor M�ximo para Dep�sito: " + valMaxDeposito + "\n" +
				"Valor M�ximo para transfer�ncia: " + valMaxTransf
				);
	}
	
	
}
