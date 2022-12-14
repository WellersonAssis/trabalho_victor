//Crie um cliente e adicione 3 endereços a ele
//Imprima os endereços desse cliente

public class Aplicacao2 {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Wellerson de Assis da Silva");
        c.setCpf("1234567890");
        c.setTelefone("3299120-4543");
        c.setVip(Boolean.valueOf("1"));


        Endereco endereco1 = new Endereco();
        endereco1.setCep("22795330");
        endereco1.setLogadouro("Rua Adina Mera");
        endereco1.setNumero("200");
        endereco1.setComplemento("Casa");
        endereco1.setCidade("Rio de Janeiro");
        endereco1.setUf("RJ");
        endereco1.setCliente(c);

        Endereco endereco2 = new Endereco();
        endereco2.setCep("35902-005");
        endereco2.setLogadouro("Rua DW-44");
        endereco2.setNumero("1345");
        endereco2.setComplemento("Apt 02, Andar 4");
        endereco2.setCidade("Itabira");
        endereco2.setUf("MG");
        endereco2.setCliente(c);

        Endereco endereco3 = new Endereco();
        endereco3.setCep("52071321");
        endereco3.setLogadouro(" Rua Bebinho Salgado");
        endereco3.setNumero("578");
        endereco3.setComplemento("Loja 03");
        endereco3.setCidade("Recife");
        endereco3.setUf("PE");
        endereco3.setCliente(c);



    }
}
