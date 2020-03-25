package aula24_Classe_Objetos;

public class Exercicio_05 {
	
	//array de string chamados de args
	
	public static void main (String [] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = 60784;
		conta.agencia="3028-x";
		conta.especial=true;
		conta.limiteEspecial=500.00;
		conta.saldo=2000;
		
		System.out.println("O saldo da conta de numero: "+ conta.numero +" = "+String.format("R$ %.2f", conta.saldo));
		
		
	}

}
