package com.algaworks.banco.app;

import com.algaworks.banco.modelo.TipoTitular;
import com.algaworks.banco.modelo.Titular;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Titular pessoa0 = new Titular("joão da silva", "1231231122", TipoTitular.fisica);
        Titular pessoa1 = new Titular("maria das parara", "1231232343", TipoTitular.juridica);
        //System.out.println(pessoa.toString());

        List<Titular> pessoas = new ArrayList<>();
        pessoas.add(pessoa0);
        pessoas.add(pessoa1);

     //   System.out.println(pessoas);

        Titular getPessoa = pessoas.get(1);
        System.out.println(getPessoa);


        Titular pessoa3 = new Titular("joão da silva", "1232231122", TipoTitular.fisica);
        boolean existe = pessoas.contains(pessoa3);
          System.out.println(existe + " essa pessoa existe no array");

     //   for (int i = 0; i < pessoas.size(); i++) {
     //       System.out.println(pessoas.get(i).getTipoTitular());
        //  }


        // isso é pra testar o alt + insert do equals e hashcode, não entendi direito pra que serve mas parece ser importante
        boolean mesmapessoa = pessoa0.equals(pessoa3);
        System.out.println(mesmapessoa);

        for (Titular pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println(pessoas.size());

    }


}
