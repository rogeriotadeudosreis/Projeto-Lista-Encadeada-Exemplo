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
public class Lista {

    private No inicio;
    private No fim;
    private int quantidadeDeElementos;

    //criar uma lista vazia
    public Lista() {
        inicio = null;
        fim = null;
        quantidadeDeElementos = 0;
    }

    //verifica se a lista está vazia
    public boolean estaVazia() {
        return inicio == null;
    }

    //insere um No no início da lista
    public void inserirInicio(Aluno aluno) {
        No no = new No(aluno, null);
        if (estaVazia()) {
            inicio = no;
            fim = no;
        } else {
            no.setProximo(inicio);
            inicio = no;
        }
        quantidadeDeElementos++;
    }

    //insere um No no início da lista
    public void inserirFim(Aluno aluno) {
        No no = new No(aluno, null);
        if (estaVazia()) {
            inicio = no;
            fim = no;
        } else {
            fim.setProximo(no);
            fim = no;
        }
        quantidadeDeElementos++;
    }

    //insere posicao
    public void inserePosicao(Aluno aluno, int posicao) {
        if (posicao < 0 || posicao > quantidadeDeElementos) {
            throw new RuntimeException("Posição inválida");
        }
        if (posicao == 0) {
            inserirInicio(aluno);
        } else {
            if (posicao == quantidadeDeElementos) {
                inserirFim(aluno);
            } else {
                No no = new No(aluno, null);
                int cont = 0;
                No aux = inicio;
                while (cont < posicao - 1) {
                    aux = aux.getProximo();
                    cont++;
                }
                no.setProximo(aux.getProximo());
                aux.setProximo(no);
                quantidadeDeElementos++;
            }
        }
    }

    public Aluno retiraInicio() {
        if (estaVazia()) {
            throw new RuntimeException("Lista vazia");
        }
        Aluno aluno = inicio.getInformacao();
        inicio = inicio.getProximo();//inicio = null
        if (quantidadeDeElementos == 1) {
            fim = null;
        }
        quantidadeDeElementos--;
        return aluno;
    }

    public Aluno retiraFim() {
        if (estaVazia()) {
            throw new RuntimeException("Lista vazia");
        }
        Aluno aluno = fim.getInformacao();

        return aluno;
    }
    // quantidade de elementos

    public int getQuantidadeDeElementos() {
        return quantidadeDeElementos;
    }

    //mostra lista
    public void mostraLista() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }
        No aux = inicio;
        while (aux != null) {
            System.out.println("Nome: " + aux.getInformacao().getNome()
                    + " e matricuila: " + aux.getInformacao().getMatricula());
            aux = aux.getProximo();

        }
    }

    //busca elemento na lista
    //retorna null, caso o elemento não existe na lista
    //caso contrário, retorna o objeto.
//    public Aluno acessarInfomacao(int chave) {
//        if (estaVazia()) {
//            return null;
//        }
//        No aux = inicio;
//        while (aux != null) {
//            if (chave == aux.getInformacao().getMatricula()) {
//                return aux.getInformacao();
//            }
//            aux = aux.getProximo();
//        }
//        return null;
//    }
    
    public Aluno retiraFim1() {
        if (estaVazia()) {
            throw new RuntimeException("Lista vazia");
        }

        Aluno aluno = fim.getInformacao();

        if (quantidadeDeElementos == 1) {
            inicio = null;
            fim = null;
            quantidadeDeElementos--;
            return aluno;
        }

        int cont = 0;
        No aux = inicio;
        
        while (cont < quantidadeDeElementos - 1) {
            aux = aux.getProximo();
            cont++;
        }
        
        aux.setProximo(null);
        fim = aux;

        quantidadeDeElementos--;

        // [aaa]  [bbb]  [ccc] [null]
        return aluno;
    }
}
