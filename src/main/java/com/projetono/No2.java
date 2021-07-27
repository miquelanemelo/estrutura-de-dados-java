package com.projetono;

public class No2 {

    private int dado;
    private No2 refNo;

    public No2() {
    }

    public No2(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setRefNo(No2 refNo) {
        this.refNo = refNo;
    }

    public No2 getRefNo() {
        return refNo;
    }


    @Override
    public String toString() {
        return "com.projetono.No2{" +
                "dado=" + dado +
                '}';
    }
}
