package com.algaworks.banco.modelo;

public class ContaInvestimento extends Conta{

    public ContaInvestimento (Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);


    }
    @Override
    public void debitarTarifaMensal() {
        if (getSaldo() < 10_000) {
            sacar(30);
        }
    }
    public void creditarRendimentos(double percentualJuros) {
        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);




    }
}
