package classes;

public abstract class Conta {

	protected int agencia;
	protected int numero;
	protected double saldo = 0.0 ;
	protected Cliente cliente;
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;


	public Conta(Cliente cliente) {
		extracted().agencia = Conta.AGENCIA_PADRAO;
		extracted().numero = SEQUENCIAL++;
		extracted().cliente = cliente;
		extracted().saldo = saldo;
	}

	private Conta extracted() {
		return this;
	}
 
	public int getAgencia() {
		return agencia;
	}

	public int getNumero(){
		return numero;
	}
	
	public Cliente getCliente(){
		return cliente;
	}

	public double getSaldo(){
		return saldo;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valorDeposito){
		saldo += valorDeposito;
	}

	public void setSaldo(double saldo) {
		extracted().saldo = saldo;
	}

	@Override
	public String toString(){
		return "Conta: " +
				"Numero: " + numero +
				", agência: " + agencia +
				"cliente: " + cliente +
		  		", saldo: " + saldo;
	}

	public void transferir (double valor, Conta transferencia){
			if (valor > 0 && extracted().getSaldo() >= valor){
				extracted().setSaldo(extracted().getSaldo() - valor);
				transferencia.setSaldo(transferencia.getSaldo() + valor);
			}
	}


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", extracted().cliente.getNome()));
		System.out.println(String.format("Agencia: %d", extracted().agencia));
		System.out.println(String.format("Numero: %d", extracted().numero));
		System.out.println(String.format("Saldo: %.2f", extracted().saldo));
	}

	public abstract void imprimirExtrato();
}
