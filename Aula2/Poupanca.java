public class Poupanca extends Conta {

    public Poupanca(double numconta, double numbanco, double saldo) {
        super(numconta, numbanco, saldo);
    }

    public double verSaldo() {
        return this.getSaldo();
    }

    public double meuDeposito(double valor) {
        this.setDeposito(valor);
        return this.getSaldo();
    }
}
