package com.algaworks.banco.app;
import com.algaworks.banco.modelo.Banco;
import java.util.Comparator;



public class Main4 {
    public static void main(String[] args) {
        Banco banco = new Banco();


        banco.getContas().sort(Comparator.comparingInt(Conta -> (int) Conta.getSaldo()));
        banco.getContas().stream()
                .filter(conta -> conta.getNumero() > 300)
                .filter(conta -> conta.getSaldo() > 250)
                .forEach(conta -> {
          //  conta.depositar(20);

            System.out.println(conta +  "    saldo: " + conta.getSaldo());


        });
        

    }
}
