public class Main {
    public static void main(String[] args) {
        Usuario werner = new Usuario();

        werner.setNome("Werner");
        werner.setMatricula(101);
        werner.setEmail("wernersaboia@gmail.com");
        werner.setSenha("****");

        System.out.println(werner.getNome());
        System.out.println(werner.getMatricula());
        System.out.println(werner.getEmail());
        System.out.println(werner.getSenha());

        //TODO: CRIAR OBJETO FUNCIONÁRIO E MOSTRAR OS DADOS NA TELA
        //TODO: CRIAR OBJETO LIVRO E MOSTRAR OS DADOS NA TELA
    }
}