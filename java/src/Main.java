public class Main {
    public static void main(String[] args) {

        System.out.println("\n----------DADOS DO USUÁRIO----------\n");

        Usuario werner = new Usuario(
                "Werner",
                44,
                "wernersaboia@email.com",
                "****",
                101
        );

        System.out.println("Nome do usuário: " + werner.getNome());
        System.out.println("Idade: " + werner.getIdade());
        System.out.println("Número de matrícula: " + werner.getMatricula());
        System.out.println("E-mail: " + werner.getEmail());
        System.out.println("Senha: " + werner.getSenha());

        System.out.println("\n--------------DADOS DO LIVRO--------------\n");

        Livro livro = new Livro(
                "Cemitério Maldito",
                "Terror",
                "Stephen King",
                4156987,
                454,
                1983,
                "Suma"
        );


        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Número de páginas: " + livro.getPaginas());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
        System.out.println("Editora: " + livro.getEditora());

        System.out.println("\n-------------DADOS DO FUNCIONÁRIO-----------\n");

        Funcionario funcionario = new Funcionario(
                "Heitor",
                9,
                "heitorratinho@gmail.com",
                "1234",
                120.0,
                102,
                "13:00 - 18:00"
        );

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: R$ " + funcionario.getSalario());
        System.out.println("Número do funcionário: " + funcionario.getNumeroFuncionario());
        System.out.println("Horário de expediente: " + funcionario.getHorarioExpediente());

        System.out.println("\n------------------Tenha um bom dia 😉---------");
    }
}