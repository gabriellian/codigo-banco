package com.algaworks.banco.modelo.atm;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.Titular;
import com.algaworks.banco.modelo.pagamento.DocumentoEstornavel;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta) {
        System.out.println("conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("titular: " + conta.getTitular().getNome());
        System.out.println("saldo: " + conta.getSaldo());
        System.out.println("saldo disponivel: " + conta.getSaldoDisponivel());


    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if (documento.estaPago()) {
            throw new IllegalStateException("o documento ja foi pago");
        }

        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();

    }

    public void estornar(DocumentoEstornavel documento, Conta conta){
        conta.depositar(documento.getValorTotal());
        documento.estornarpagamento();
    }
}
