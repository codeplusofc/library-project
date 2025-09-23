public class Locacao {
    private Pessoa locatario;
    private Livro livro;
    private String dataLocacao;
    private String dataDevolucaoPrevista;
    private String status;

    public Locacao(Pessoa locatario, Livro livro, String dataLocacao, String dataDevolucaoPrevista) {
        this.locatario = locatario;
        this.livro = livro;
        this.dataLocacao = dataLocacao;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.status = "Ativa";
    }

    public Pessoa getLocatario() {
        return locatario;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public String getStatus() {
        return status;
    }

    public void devolver() {
        this.status = "Devolvido";
    }
}
