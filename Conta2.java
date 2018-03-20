
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
			System.out.println("Detectamos um problema, por favor entrar em contato com a administradora do cartão");
		}else {
			System.out.println("Saque autorizado!");
			this.saldo -= valor;	
		}
	}
	
	void deposita(double valor) {
		if(valor > valMaxDeposito) {
			System.out.println("Você atingiu o valor máximo permitido para depósito de: " + valMaxDeposito);
		}else {
			System.out.println("Depósito autorizado!");
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
				System.out.println("Realizando Transferência...");
				destino.deposita(valor);
			}
		}else {
			System.out.println("Valor limite para transferência atingido \n\n");
		}
	  }
	
	void recuperarDadosParaImpressao() {
		
		//Formatar Data
		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/YYYY");
		String dataAberturaFormat = formatData.format(dataAbertura.calendario.getTime());
		
		System.out.println(
				"Cliente: " + nome + "\n" +
				"Conta: "+ numero + "\n" +
				"Agência: " + agencia + "\n" +
				"Saldo: " + saldo + "\n" +
				"Data de Abertura: " + dataAberturaFormat + "\n" +
				"Valor Máximo para Depósito: " + valMaxDeposito + "\n" +
				"Valor Máximo para transferência: " + valMaxTransf
				);
	}
	
	
}
