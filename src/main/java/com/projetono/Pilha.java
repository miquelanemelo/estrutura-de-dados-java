package com.projetono;

public class Pilha {

    private No2 refNoEntradaPilha;
    private String StringRetorno;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    public void push(No2 novoNo){
        No2 refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No2 pop(){
        if(this.isEmpty()) {
            No2 noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();

        }return null;
    }
    public No2 top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
            return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
    String StringRetorno ="----------------------\n";
    StringRetorno += "     com.projetono.Pilha\n";
    StringRetorno += "----------------------\n";

    No2 noAuxiliar = refNoEntradaPilha;
    while(true) {
        if (noAuxiliar != null) {
            StringRetorno += "[com.projetono.No2{dado=" + noAuxiliar.getDado()  +"}]\n";
            noAuxiliar = noAuxiliar.getRefNo();
        } else {
            break;
        }
    }
        return StringRetorno;
    }


    }



