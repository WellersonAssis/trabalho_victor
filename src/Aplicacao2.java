//Crie um cliente e adicione 3 endereços a ele
//Imprima os endereços desse cliente

public class Aplicacao2 {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Wellerson de Assis da Silva");
        c.setCpf("1234567890");
        c.setTelefone("3299120-4543");
        c.setVip(Boolean.valueOf("1"));


        Endereco endereco1 = new Endereco("22795330","Rua Adina Mera","200","Casa","Rio de Janeiro","RJ");
        endereco1.setCliente(c);

        Endereco endereco2 = new Endereco("35902-005","Rua DW-44","1345","Apt 02, Andar 4","Itabira","MG");
        endereco2.setCliente(c);

        Endereco endereco3 = new Endereco("52071321","Rua Bebinho Salgado","578","Loja 03","Recife","PE");
        endereco3.setCliente(c);



    }
}
