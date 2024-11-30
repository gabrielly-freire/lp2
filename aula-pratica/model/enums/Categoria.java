package model.enums;

public enum Categoria {

    ALIMENTOS("Alimentos"),
    ELETRONICOS("Eletrônicos"),
    ROUPAS("Roupas"),
    BELEZA("Beleza"),
    SAUDE("Saúde");

    private String descricao;

    private Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
