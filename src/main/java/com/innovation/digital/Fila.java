package com.innovation.digital;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (refNoEntradaFila != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
        }
        return null;
    }
    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        return stringRetorno;
    }
}

