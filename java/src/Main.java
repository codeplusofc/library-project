import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("\n----------Sistema de Cadastro---------\n");

        do {
            System.out.println("\n-----MENU PRINCIPAL-----");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar funcionário");
            System.out.println("3 - Cadastrar livro");
            System.out.println("4 - Registrar locação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario(scanner);
                    break;
                case 2:
                    cadastrarFuncionario(scanner);
                    break;
                case 3:
                    cadastrarLivro(scanner);
                    break;
                case 4:
                    registrarLocacao(scanner);
                    break;
                case 0:
                    System.out.println("\nObrigado por usar o sistema. Tenha um bom dia!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        System.out.println("\n------------------Tenha um bom dia 😉---------");
    }

        private static void cadastrarUsuario(Scanner scanner) {
        System.out.println("\n---  Cadastro de Usuário ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        Endereco endereco = cadastrarEndereco(scanner);

        Usuario usuario = new Usuario(nome, idade, email, senha, matricula);
        usuario.setEndereco(endereco);

                System.out.println("\n USUÁRIO CADASTRADO:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Matrícula: " + usuario.getMatricula());
        if (usuario.getEndereco() != null) {
            System.out.println("Endereço: " + usuario.getEndereco().getLogradouro() + ", " +
                    usuario.getEndereco().getNumero() + " - " +
                    usuario.getEndereco().getCidade() + "/" + usuario.getEndereco().getEstado());
        }
    }

        private static void cadastrarFuncionario(Scanner scanner) {
        System.out.println("\n--- 👨‍💼 Cadastro de Funcionário ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Salário: R$ ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Número do Funcionário: ");
        long numeroFuncionario = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Horário de Expediente (ex: 13:00 - 18:00): ");
        String horarioExpediente = scanner.nextLine();

        Endereco endereco = cadastrarEndereco(scanner);

        Funcionario funcionario = new Funcionario(nome, idade, email, senha, salario, numeroFuncionario, horarioExpediente);
        funcionario.setEndereco(endereco);

                System.out.println("\n FUNCIONÁRIO CADASTRADO:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: R$ " + funcionario.getSalario());
        System.out.println("Número: " + funcionario.getNumeroFuncionario());
        System.out.println("Horário: " + funcionario.getHorarioExpediente());
        if (funcionario.getEndereco() != null) {
            System.out.println("Endereço: " + funcionario.getEndereco().getCidade() + "/" + funcionario.getEndereco().getEstado());
        }
    }

        private static void cadastrarLivro(Scanner scanner) {
        System.out.println("\n---  Cadastro de Livro ---");

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("ISBN: ");
        long isbn = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Número de Páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        Livro livro = new Livro(titulo, genero, autor, isbn, paginas, anoPublicacao, editora);

                System.out.println("\n LIVRO CADASTRADO:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Ano: " + livro.getAnoPublicacao());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Páginas: " + livro.getPaginas());
    }

        private static void registrarLocacao(Scanner scanner) {
        System.out.println("\n---  Registro de Locação ---");

        System.out.println("Quem está locando?");
        System.out.println("1 - Usuário");
        System.out.println("2 - Funcionário");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Pessoa locatario = null;

        if (tipo == 1) {
            System.out.print("Digite o nome do usuário: ");
            String nome = scanner.nextLine();
                        locatario = new Usuario(nome, 0, "nao@informado.com", "****", 999);
        } else if (tipo == 2) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            // Criando um funcionário temporário só para a locação
            locatario = new Funcionario(nome, 0, "nao@informado.com", "****", 0.0, 999, "Não informado");
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
                Livro livro = new Livro(titulo, "Não informado", "Autor Desconhecido", 0, 0, 2025, "Editora X");

        System.out.print("Data de locação (ex: 10/06/2025): ");
        String dataLocacao = scanner.nextLine();

        System.out.print("Data de devolução prevista (ex: 24/06/2025): ");
        String dataDevolucao = scanner.nextLine();

                Locacao locacao = new Locacao(locatario, livro, dataLocacao, dataDevolucao);

                System.out.println("\n LOCAÇÃO REGISTRADA!");
        System.out.println("Locatário: " + locacao.getLocatario().getNome());
        System.out.println("Livro: " + locacao.getLivro().getTitulo());
        System.out.println("Locação: " + locacao.getDataLocacao());
        System.out.println("Devolução prevista: " + locacao.getDataDevolucaoPrevista());
        System.out.println("Status: " + locacao.getStatus());
    }

        private static Endereco cadastrarEndereco(Scanner scanner) {
        System.out.println("\n---  Cadastro de Endereço ---");

        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Complemento (opcional): ");
        String complemento = scanner.nextLine();

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Estado (ex: SP, RJ): ");
        String estado = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        System.out.print("País (pressione Enter para 'Brasil'): ");
        String pais = scanner.nextLine();
        if (pais.trim().isEmpty()) {
            pais = "Brasil";
        }

        return new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep, pais);
    }
}