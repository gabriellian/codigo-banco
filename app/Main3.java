package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;

import com.algaworks.banco.modelo.Conta;

import java.util.Comparator;
//import java.util.function.ToIntFunction;

public class Main3 {

    public static void main(String[] args) {
        Banco banco = new Banco();


        //ToIntFunction<Conta> function = (Conta conta) -> {return conta.getAgencia();};

        //usado pra colocar em ordem numerica a lista
    //    banco.getContas().sort(Comparator.comparingInt(new NumeroContaFunction()));
        banco.getContas().sort(Comparator.comparingInt(Conta::getAgencia));


        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());


        }




    }
}
