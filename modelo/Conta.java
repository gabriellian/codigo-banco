package com.algaworks.banco.modelo;

import com.algaworks.banco.modelo.excecoes.SaldoInsuficienteException;

import java.util.Objects;

public abstract class Conta {

    Conta() {

    }
   private Titular titular;
    private double saldo;
    private int agencia;
    private int numero;

    public Conta(Titular titular, int agencia, int numero) {
        Objects.requireNonNull(titular, "o valor titular não pode ser nulo");

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void debitarTarifaMensal();

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("o valor deve ser maior que zero");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > getSaldoDisponivel()) {
           throw new SaldoInsuficienteException("");
       } else if (valor <= 0) {
           throw new IllegalArgumentException("o valor deve ser maior que zero");

        }
        saldo = saldo - valor;
    }

    public void sacar(double valor, double taxasaque){
        sacar(valor + taxasaque);
    }


    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    public Titular getTitular() {
        return titular;
    }



    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel(){
        return getSaldo();
    }



    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


}
