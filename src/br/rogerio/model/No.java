/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rogerio.model;

/**
 *
 * @author roger
 */
public class No {
    private Aluno informacao;
    private No proximo;

    public No(Aluno info, No prox) {
        this.informacao = info;
        this.proximo = prox;
    }

    public Aluno getInformacao() {
        return informacao;
    }

    public void setInformacao(Aluno informacao) {
        this.informacao = informacao;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    
}
