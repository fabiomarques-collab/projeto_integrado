public class Cliente {
    private int tipo;
    private String descricao;
    private boolean temDesconto;

    public void setTipo(int tipo) {

        this.tipo = tipo;
    }

    public int getTipo() {

        return this.tipo;
    }
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