import java.util.ArrayList;

public class SistemaMain {

    public static void main(String[] args) {

        // --- Configuração dos membros ---
        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Ana Souza");
        voluntario.setCpf("111.222.333-44");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Logística");

        Doador doador = new Doador();
        doador.setNome("Carlos Lima");
        doador.setCpf("555.666.777-88");
        doador.setDiasAtuacao(365);
        doador.setValorDoadoMensal(250.00);

        // --- Regra de negócio ---
        System.out.println("--- Testando regra de negócio ---");
        voluntario.setDiasAtuacao(-10);
        System.out.println();

        // --- Projeto Social ---
        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Educar para Transformar");
        projeto.setMetaImpacto(500);
        projeto.setLider(voluntario);
        projeto.iniciarProjeto();
        System.out.println();

        // --- Polimorfismo com ArrayList<MembroONG> ---
        // A lista aceita qualquer subtipo de MembroONG.
        // O Java decide em tempo de execução qual exibirResumo() chamar
        // — isso é polimorfismo dinâmico (late binding).
        ArrayList<MembroONG> membros = new ArrayList<>();
        membros.add(voluntario);
        membros.add(doador);

        System.out.println("====================================");
        System.out.println("  RELATÓRIO GERAL DE MEMBROS (via polimorfismo)");
        System.out.println("====================================");
        for (MembroONG membro : membros) {
            membro.exibirResumo();
            System.out.println();
        }
    }
}
