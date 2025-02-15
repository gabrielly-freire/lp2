public class Endereco {
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco(String nomeRua, String numero, String complemento, String cep, String cidade, String estado) {
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco [nomeRua=" + nomeRua + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep
                + ", cidade=" + cidade + ", estado=" + estado + "]";
    }
    
}
