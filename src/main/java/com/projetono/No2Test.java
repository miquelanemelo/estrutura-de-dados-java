package com.projetono;

public class No2Test {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No2(1));
        minhaPilha.push(new No2(2));
        minhaPilha.push(new No2(3));
        minhaPilha.push(new No2(4));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
        System.out.println(minhaPilha.top());
        System.out.println(minhaPilha);
    }
}
