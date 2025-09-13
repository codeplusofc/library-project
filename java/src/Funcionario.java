public class Funcionario extends Pessoa {
    private double salario;
    private long numeroFuncionario;
    private String horarioExpediente;

    public Funcionario(String nome, int idade, String email, String senha,
                       double salario, long numeroFuncionario, String horarioExpediente) {
        super(nome, idade, email, senha);
        this.salario = salario;
        this.numeroFuncionario = numeroFuncionario;
        this.horarioExpediente = horarioExpediente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(long numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public String getHorarioExpediente() {
        return horarioExpediente;
    }

    public void setHorarioExpediente(String horarioExpediente) {
        this.horarioExpediente = horarioExpediente;
    }
}
