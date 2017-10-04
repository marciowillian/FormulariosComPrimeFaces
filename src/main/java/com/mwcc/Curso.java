package com.mwcc;

import java.io.Serializable;

public class Curso {
   private Integer codigo;
   private String nome;

   public Curso(Integer cod, String nome){
       this.codigo = cod;
       this.nome = nome;
   }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
