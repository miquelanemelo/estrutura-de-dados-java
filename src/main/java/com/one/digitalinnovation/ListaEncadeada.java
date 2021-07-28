package com.one.digitalinnovation;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){ // add: recebe um conteudo, cria um novo no e adiciona na lista
    No<T> novoNo = new No<>(conteudo);
    if(this.isEmpty()){
        referenciaEntrada = novoNo;
        return;
    }
    No<T> noAuxiliar = referenciaEntrada;
    for(int i = 0; i< this.size()-1; i++){
        noAuxiliar = noAuxiliar.getProximoNo();
    }
    noAuxiliar.setProximoNo(novoNo);

    }

    public int size() { // verificar o tamanho da lista
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoLista++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }
        return tamanhoLista;
    }
    public boolean isEmpty() { // verificar se a lista esta vazia //
        return referenciaEntrada == null ? true : false;
    }

}
