public abstract Conta {
    private double numconta;
    private double numbanco;
    private double saldo;
    private double deposito;
    private double saque;
}

// Construtor

Conta(double numconta; double numbanco; double saldo){
    this.numbanco = numbanco;
    this.saldo = saldo;
}

// Getters e Setters

public double getnumconta(){
    return numconta;
}
public void setnumconta(double numconta){
    this.numconta = numconta;
}
public double getnumbanco(){
    return numbanco;
}
public void setnumbanco(double numbanco){
    this.numbanco = numbanco;
}
public double getsaldo(){
    return saldo;
}
public void setsaldo(double saldo){
    this.saldo = saldo;
}
public double getdeposito(){
    return deposito;
}
public void setdeposito(double deposito){
    this.deposito = deposito;
}
public double getsaque(){
    return saque;
}
public void setsaque(double saque){
    this.saque = saque;
}