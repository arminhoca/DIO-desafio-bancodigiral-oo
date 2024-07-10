package execultar;

import java.time.LocalDate;

import classes.Cliente;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		LocalDate dataAbertura = LocalDate.ofEpochDay(8/9/2000);

		Cliente yasmin = new Cliente("yasmin", dataAbertura);

		Conta corrente = new ContaCorrente(yasmin);
		Conta poupanca = new ContaPoupanca(yasmin);

		corrente.depositar(150);
		corrente.transferir(80, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}