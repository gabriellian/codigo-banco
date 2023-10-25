package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;
import com.algaworks.banco.modelo.atm.CaixaEletronico;
import com.algaworks.banco.modelo.excecoes.SaldoInsuficienteException;
import com.algaworks.banco.modelo.pagamento.Boleto;
import com.algaworks.banco.modelo.pagamento.DocumentoEstornavel;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;
import com.algaworks.banco.modelo.pagamento.HoleriteSalario;

public class Main {
    public static void main(String[] args) {

        Titular titular1 = new Titular();
        Titular titular2 = new Titular();

       // Conta minhaConta = new Conta(titular1, 12333, 21);
        ContaInvestimento contaTesouroCelic = new ContaInvestimento(titular2, 22233, 42);
        ContaEspecial contaFiel = new ContaEspecial(titular1, 12333, 21, 1_000);
        //minhaConta.titular = titular1;

        titular1.setTipoTitular(TipoTitular.juridica);
        System.out.println(titular1.getTipoTitular());
        titular1.setNome("Rogério");
        titular1.setDocumento("22233355544");
        titular2.setNome("maria");
        titular2.setDocumento("303.292.555-33");
        //minhaConta.saldo = 5_000.00;
        //minhaConta.agencia = 12333;
        //minhaConta.numero = 21;

        CaixaEletronico caixaEletronico = new CaixaEletronico();
       // Conta conta = contaTesouroCelic;
       // conta.debitarTarifaMensal();

        //minhaConta.depositar(15_000);
        //minhaConta.sacar(200,15 );
        try {
            contaTesouroCelic.depositar(15_000);
            contaFiel.depositar(15_000);
            contaTesouroCelic.creditarRendimentos(0.8);
        } catch (IllegalArgumentException e){
            System.out.println("erro ao codificar, o valor digitado não pode ser 0 tente mudar o valor " + e.getMessage());
        }

        try {
            contaFiel.sacar(15_500);
            contaTesouroCelic.sacar(16_000);
            contaTesouroCelic.debitarTarifaMensal();
            contaFiel.debitarTarifaMensal();
        } catch (SaldoInsuficienteException e) {
            System.out.println("erro ao codificar, o valor desejado de saque é superior ao saldo disponivel em sua conta, tente outro valor" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("o valor inserido de saque não pode ser 0, tente sacar outro valor" + e.getMessage());
        }
        /*
        System.out.println("numero da conta " + minhaConta.getNumero());
        System.out.println("titular " + titular1.getNome());
        System.out.println("documento   " + titular1.getDocumento());
        System.out.println("saldo " + minhaConta.getSaldo());

        System.out.println("numero da conta " + contaTesouroCelic.getNumero());
        System.out.println("titular " + titular2.getNome());
        System.out.println("documento   " + titular2.getDocumento());
        System.out.println("saldo " + contaTesouroCelic.getSaldo());
        System.out.println("saldo " + contaFiel.getSaldo()); */

        DocumentoEstornavel boletoEscola = new Boleto(titular2, 200);
        DocumentoPagavel holerite = new HoleriteSalario(10, 10, titular1);
        caixaEletronico.pagar(holerite, contaFiel);

        caixaEletronico.estornar(boletoEscola, contaTesouroCelic);

        boletoEscola.imprimirRecibo();
        holerite.imprimirRecibo();


        caixaEletronico.pagar(boletoEscola, contaTesouroCelic);
        System.out.println("boleto escola pago: " + boletoEscola.estaPago());
        caixaEletronico.imprimirSaldo(contaTesouroCelic);
        System.out.println();
        caixaEletronico.imprimirSaldo(contaFiel);
    }
}

