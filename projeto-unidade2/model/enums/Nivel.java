package model.enums;

/**
 * Enumeração para os níveis de formação acadêmica.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public enum Nivel {
    I("Nível I"),
    II("Nível II"),
    III("Nível III"),
    IV("Nível IV"),
    V("Nível V"),
    VI("Nível VI"),
    VII("Nível VII"),
    VIII("Nível VIII");

    private String descricao;

    Nivel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
