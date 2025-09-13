public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    private long isbn;
    private int paginas;
    private int anoPublicacao;
    private String editora;

    public Livro(String titulo, String genero, String autor, long isbn, int paginas, int anoPublicacao, String editora) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.anoPublicacao = (int) anoPublicacao;
        this.editora = editora;
    }

    // 👇 GETTERS E SETTERS (já existem, mas deixei aqui pra completar)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public long getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
