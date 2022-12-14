public class ContaCorrente extends Conta {

    public float saldo;
    private Double limite;

    private Cliente cliente;

    public ContaCorrente(Double limite, float saldo){
        super(saldo);
        this.setLimite(limite);

    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void trasferir(Conta contaDestino, Double valor) {

    }

    public Double calcularSaldo() {
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double v) {

    }

    public void sacar(double v) {
    }



}

