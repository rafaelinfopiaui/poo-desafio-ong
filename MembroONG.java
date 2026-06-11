public class MembroONG {

    private String nome;
    private String cpf;
    private int diasAtuacao;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasAtuacao(int diasAtuacao) {
        if (diasAtuacao >= 0) {
            this.diasAtuacao = diasAtuacao;
        } else {
            System.out.println("Dias de atuação não podem ser negativos.");
        }
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Dias de atuação: " + diasAtuacao);
    }
}