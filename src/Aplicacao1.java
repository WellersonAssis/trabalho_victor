//Crie dois funcionários do banco, um gerente e um atendente.
public class Aplicacao1 {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("Fabio");

        Funcionario f2 = new Funcionario();
        f2.setNome("Marcelo");

        Cargo g1 = new Cargo();
        g1.setNome("Gerente");
        g1.setFuncionario(f1);

        Cargo g2 = new Cargo();
        g2.setNome("Atendente");
        g2.setFuncionario(f2);



    }
}
