public abstract class MembroONG {

    private String nome;
    private String cpf;
    private int diasAtuacao;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasAtuacao(int dias) {
        if (dias >= 0) {
            this.diasAtuacao = dias;
        } else {
            System.out.println("Erro: dias de atuação não podem ser negativos.");
        }
    }

    // Contrato obrigatório: cada subclasse DEVE implementar seu próprio resumo.
    // Não faz sentido instanciar um "MembroONG genérico" — toda pessoa é
    // voluntária ou doadora. Por isso a classe e o método são abstratos.
    public abstract void exibirResumo();
}
