public class No2 {

    private int dado;
    private int refNo;

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

    public int getRefNo() {
        return refNo;
    }

    public void setRefDado(int refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No2{" +
                "dado=" + dado +
                '}';
    }
}
