package com.algaworks.banco.modelo.pagamento;

import com.algaworks.banco.modelo.Titular;

public class HoleriteSalario implements DocumentoPagavel{
    private double valorHora;
    private Titular funcionario;
    private double horasDeTrabalho;
    private boolean pago;

    public HoleriteSalario(double valorHora, double horasDeTrabalho, Titular funcionario) {
        this.valorHora = valorHora;
        this.horasDeTrabalho = horasDeTrabalho;
        this.funcionario = funcionario;
    }

    @Override
    public double getValorTotal() {
        return valorHora * horasDeTrabalho;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
    pago = true;
    }
}
