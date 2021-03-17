/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rogerio.app;

import br.rogerio.model.Aluno;
import br.rogerio.model.Lista;

/**
 *
 * @author roger
 */
public class TesteLista {
    public static void main(String[] args) {
        Lista lista1 = new Lista();//cria uma lista vazia
        lista1.inserirInicio(new Aluno("JJJJJ",10000));
        lista1.inserirInicio(new Aluno("DDDD",2522));
        lista1.inserirInicio(new Aluno("AAAA",333));
        lista1.inserirInicio(new Aluno("BBBB",101));
        lista1.inserirInicio(new Aluno("KKKKK",280));
        lista1.inserirFim(new Aluno("PPPPP",500));
        lista1.inserePosicao(new Aluno("Job",500), 0);
        System.out.println("Elementos da Lista");
        lista1.mostraLista();
        System.out.println("Quantidade de elementos: "+lista1.getQuantidadeDeElementos());
        System.out.println("Elemento retirado: "+lista1.retiraInicio().getNome());
        System.out.println("\nElementos da Lista apos a remoção");
        lista1.mostraLista();
        
    }
    
}
