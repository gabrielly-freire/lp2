package model.enums;

/**
 * Enumeração para os tipos de formação acadêmica.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public enum Formacao {
    ESPECIALIZACAO("Especialização"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado");

    private String descricao;

    Formacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
