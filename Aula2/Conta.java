public abstract class Conta {

    private double numconta;
    private double numbanco;
    private double saldo;
    private double deposito;
    private double saque;

    public Conta(double numconta, double numbanco, double saldo) {
        this.numconta = numconta;
        this.numbanco = numbanco;
        this.saldo = saldo;
    }

    public double getNumconta() {
        return numconta;
    }

    public void setNumconta(double numconta) {
        this.numconta = numconta;
    }

    public double getNumbanco() {
        return numbanco;
    }

    public void setNumbanco(double numbanco) {
        this.numbanco = numbanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        this.saldo = this.saldo + deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
        this.saldo = this.saldo - saque;
    }
}
