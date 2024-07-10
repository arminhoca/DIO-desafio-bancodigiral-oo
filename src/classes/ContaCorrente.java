package classes;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	public void sacar (double valor){
		if (getSaldo() > valor){
		setSaldo(getSaldo() - valor);
		System.out.println("Saque de " + valor + " realizado com sucesso.");

		} else{
			System.out.println("Saldo insuficiente, não foi possível realizar o saque" +
		"Saldo atual: "	+ valor);
		}
	}

	
}
