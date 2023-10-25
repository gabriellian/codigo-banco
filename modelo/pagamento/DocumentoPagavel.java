package com.algaworks.banco.modelo.pagamento;

public interface DocumentoPagavel {

     double getValorTotal();
     boolean estaPago();
     void quitarPagamento();

     default void imprimirRecibo(){
          System.out.println("recibo:");
          System.out.println("valor total:" + getValorTotal());
          System.out.println("pago: " + estaPago());
     }

}
