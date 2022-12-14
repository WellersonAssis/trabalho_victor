

public class Conta {


    private String numero;

    private Conta conta;

    private Cliente cliente;

    public Conta(String numero) {
        this.setNumero(numero);
    }

    public Conta(float saldo) {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double depositar;

    public Double sacar;


    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void depositar() {
        this.depositar = 00.00 + 100.00 ;
    }

    public void sacar() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
