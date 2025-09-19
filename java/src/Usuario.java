public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, int idade, String email, String senha, int matricula) {
        super(nome, idade, email, senha);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
