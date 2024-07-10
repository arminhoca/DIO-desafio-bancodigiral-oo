package classes;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private LocalDate dataAbertura;
	
	public Cliente(String nome, LocalDate dataAbertura){
		this.nome = nome;
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString(){
		return this.nome +
				", data de abertura da conta: " + this.dataAbertura;
	}
	public String getNome(){
		return nome;
	}
	public LocalDate getDataAbertura(){
		return dataAbertura;
	}
}