package com.example;
import lombok.Getter;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
    protected Cliente cliente;

    @Getter
	protected int agencia;

    @Getter
	protected int numero;

    @Getter
	protected double saldo;

    public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}


    @Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
    public void alterarEndereco(String endereco){
        this.cliente.setEndereco(endereco);
    }

    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Endereço: %s", this.cliente.getEndereco()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
