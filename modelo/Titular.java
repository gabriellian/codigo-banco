package com.algaworks.banco.modelo;

import java.util.Objects;

public class Titular {

    private String nome;
    private String documento;

    private TipoTitular tipoTitular = TipoTitular.fisica;


    public Titular() {

    }
    public Titular(String nome, String documento, TipoTitular tipoTitular) {
        this.nome = nome;
        this.documento = documento;
        this.tipoTitular = tipoTitular;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", tipoTitular=" + tipoTitular +
                '}';
    }

    public TipoTitular getTipoTitular() {
        return tipoTitular;
    }

    public void setTipoTitular(TipoTitular tipoTitular) {
        this.tipoTitular = tipoTitular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titular titular = (Titular) o;
        return Objects.equals(documento, titular.documento);
    }


    @Override
    public int hashCode() {
        return Objects.hash(documento);
    } //estudar mais sobre isso
}
