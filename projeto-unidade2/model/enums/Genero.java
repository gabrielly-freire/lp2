package model.enums;

/**
 * Enumeração para os tipos de gênero.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    OUTRO("Outro");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
