public class Corrente extends Conta implements IConta {

    public Corrente(double numconta, double numbanco, double saldo) {
        super(numconta, numbanco, saldo);
    }

    @Override
    public double verSaldo() {
        return this.getSaldo();
    }

    @Override
    public double nDeposito(double valor) {
        this.setDeposito(valor);
        return this.getSaldo();
    }

    @Override
    public double nSaque(double valor) {
        this.setSaque(valor);
        return this.getSaldo();
    }
}
