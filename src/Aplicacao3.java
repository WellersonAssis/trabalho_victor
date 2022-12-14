//Crie um cliente que possua uma ContaCorrente
//Efetue três depósitos de 100 nessa ContaCorrente
//Efetue um saque de 50 reais nessa ContaCorrente
//Imprima o valor do saldo dessa ContaCorrente

public class Aplicacao3 {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Marcos");
        c.setCpf("1234567890");
        c.setTelefone("32323232");

        Conta con = new Conta("0001");
        ContaCorrente concc = new ContaCorrente(10000.00, 00);

        concc.setCliente(c);









    }





}
