package classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nomeBanco;
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<>();
		this.nomeBanco = "Banco-Armca";
	}
	
		public void adicionarConta(Conta conta){
			contas.add(conta);
		}

		public List<Conta> listarContas(){
			return contas;
		}
	
	@Override
	public String toString() {
		return "Banco{" +
				"nomeBanco: '" + nomeBanco + '\'' +
				", contas: " + contas +
				'}';
	}
	
} 