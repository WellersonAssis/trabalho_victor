public class ContaPoupanca extends Conta {

    private Double rentabilidadeMensal;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public Double calcularSaldo() {
        return null;
    }
}