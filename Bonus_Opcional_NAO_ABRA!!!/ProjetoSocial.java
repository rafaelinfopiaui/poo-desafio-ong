public class ProjetoSocial {

    private String nomeDoProjeto;
    private int metaImpacto;
    private Voluntario lider;

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public int getMetaImpacto() {
        return metaImpacto;
    }

    public void setMetaImpacto(int metaImpacto) {
        this.metaImpacto = metaImpacto;
    }

    public Voluntario getLider() {
        return lider;
    }

    public void setLider(Voluntario lider) {
        this.lider = lider;
    }

    public void iniciarProjeto() {
        System.out.println("=== PROJETO SOCIAL ===");
        System.out.println("Projeto: " + nomeDoProjeto);
        System.out.println("Meta de impacto: " + metaImpacto + " pessoas");
        System.out.println("Líder: " + lider.getNome() + " (Setor: " + lider.getSetor() + ")");
    }
}
