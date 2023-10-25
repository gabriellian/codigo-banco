package com.algaworks.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public Banco() {
            Titular titular1 = new Titular("gabriel da silva", "29299292199921", TipoTitular.fisica);
            Titular titular2 = new Titular("maria josé pereira", "30454859349383", TipoTitular.fisica);

            Conta conta1 = new ContaInvestimento(titular1, 223, 9292929);
            Conta conta2 = new ContaInvestimento(titular2, 211, 94933838);
            Conta conta3 = new ContaInvestimento(titular1, 111, 271716371);
            Conta conta4 = new ContaInvestimento(titular2, 999, 93838322);
            Conta conta5 = new ContaInvestimento(titular1, 223, 9292929);
            Conta conta6 = new ContaEspecial(titular2, 211, 94933838, 8000);

            conta1.depositar(500);
            conta2.depositar(300);
            conta3.depositar(200);
            conta4.depositar(100);
            conta5.depositar(700);
            conta6.depositar(600);

            contas.add(conta1);
            contas.add(conta2);
            contas.add(conta3);
            contas.add(conta4);
            contas.add(conta5);
            contas.add(conta6);



        }
}
