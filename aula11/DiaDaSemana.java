package aula11;

public enum DiaDaSemana {

    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);
    
    private Integer dia;

    DiaDaSemana(Integer dia) {
        this.dia = dia;
    }

    public Integer getDia() {
        return dia;
    }
}
