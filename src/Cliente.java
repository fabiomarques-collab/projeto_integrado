public class Cliente {
    //private int tipo;
    private String descricao;
    private boolean temDesconto;

    public boolean temDesconto() {

        return temDesconto;
    }

    public void setTemDesconto(boolean temDesconto) {
        this.temDesconto = temDesconto;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }
}