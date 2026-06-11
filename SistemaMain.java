public class SistemaMain {

    public static void main(String[] args) {

        // 1. Voluntário
        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Ana Souza");
        voluntario.setCpf("111.222.333-44");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Logística");

        // 2. Doador
        Doador doador = new Doador();
        doador.setNome("Carlos Lima");
        doador.setCpf("555.666.777-88");
        doador.setDiasAtuacao(365);
        doador.setValorDoadoMensal(250.00);

        // 3. Teste da regra de negócio (deve exibir mensagem de erro)
        System.out.println("--- Testando regra de negócio ---");
        voluntario.setDiasAtuacao(-10);
        System.out.println();

        // 4. Resumos
        voluntario.exibirResumo();
        System.out.println();
        doador.exibirResumo();
        System.out.println();

        // 5. Projeto social com o voluntário como líder
        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Educar para Transformar");
        projeto.setMetaImpacto(500);
        projeto.setLider(voluntario);

        // 6. Início do projeto
        projeto.iniciarProjeto();
    }
}
