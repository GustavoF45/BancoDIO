package com.example;

public class Main {
    public static void main(String[] args) {
        
        Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
        venilton.setCpf("0123456789");
        venilton.setEndereco("Rua Hello World");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        poupanca.alterarEndereco("Rua Teste");
        poupanca.imprimirExtrato();
    }
}