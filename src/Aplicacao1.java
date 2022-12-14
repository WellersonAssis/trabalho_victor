//Crie dois funcionários do banco, um gerente e um atendente.

public class Aplicacao1 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario(2000.00);
        f.setNome("Rafael Vieira");

        Funcionario f2 = new Funcionario(800.00);
        f2.setNome("José Orvalino");


        Cargo c = new Cargo("Gerente");
        Cargo c2 = new Cargo("Atendente");

        c.setFuncionario(f);
        c2.setFuncionario(f2);



    }

}

