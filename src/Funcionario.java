public class Funcionario extends Pessoa {

    private Double salario;
    private Cargo cargo;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Cargo getCargo(String atendente) {
        return cargo;
    }

    public void setCargo() {
        this.cargo = cargo;
    }
}
