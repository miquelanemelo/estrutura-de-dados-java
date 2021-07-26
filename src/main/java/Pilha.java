public class Pilha {

    private No2 refNoEntradaPilha;

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
    }
