package com.algaworks.banco.modelo.pagamento;

import com.algaworks.banco.modelo.Titular;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel{

private Titular beneficiario;
private double valor;
private boolean pago;

    public Boleto(Titular beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;

    }

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago ;
    }

    @Override
    public void quitarPagamento() {
    pago = true;
    }

    @Override
    public void estornarpagamento() {
        pago = false;
    }
}
