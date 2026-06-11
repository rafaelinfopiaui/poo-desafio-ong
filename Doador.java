public class Doador extends MembroONG {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    @Override
    public void exibirResumo() {
        System.out.println("=== DOADOR ATIVO ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Dias de atuação: " + getDiasAtuacao());
        System.out.printf("Valor doado mensal: R$ %.2f%n", valorDoadoMensal);
    }
}
