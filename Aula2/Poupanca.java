
public class Poupanca extends conta implements IContas, ICliente {

    @Override
    public double saldo() {
        return this.getSaldo();
    }

    @Override
    public double depositar(double valor) {
        return valor;
    }

    @Override
    public double sacar(double valor) {
        return valor;
    }

    @Override
    public void abrirConta() {
        
        Corrente corr = new Corrente();

        corr.setNumbank(001);
        corr.setNumero(10.115);
       
        // Dados cliente
        System.out.println("Seu banco é: " + corr.getNumbank() + 
        "\n Sua conta corrente é:" + corr.getNumero() +
        "\n Nome do cliente: " + this.getnomecli() +
        "\n CPF do cliente: " + this.getcpfcli());

    }


}