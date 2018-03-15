
public class VidaPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Gleidson";
		pessoa.idade = 26;
		
		pessoa.fazerAniversario(10);
		
		System.out.println("Idade de " + pessoa.nome + ": " + pessoa.idade);
		
		
		
	}
}
