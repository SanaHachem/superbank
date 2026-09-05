public class Corrente extends conta {

    private String  nomecli;
    private String cpfcli;

    public double saldo(){
        return this.getSaldo();
    }
    
    
    public double depositar(double valordep) {
        return valordep;
    }

    public double sacar(double valorsac) {
        return valorsac;
    }

    public void abrirConta() {
        this.setNumbank (001);
        this.setNumero (10.114);
        
        // Dados cliente
        System.out.println("Seu banco é: " + this.getNumbank() + 
        "\n Sua conta corrente é:" + this.getNumero() +
        "\n Nome do cliente: " + this.getnomecli() +
        "\n CPF do cliente: " + this.getcpfcli());

    }

    // Getters e Setters

    public String getnomecli(){
        return nomecli;
    }

    public void setnomecli(String nomecli){
        this.nomecli = nomecli;
    }
    
    public String getcpfcli(){
        return cpfcli;
    }

    public void setcpfcli(String cpfcli){
        this.cpfcli = cpfcli;
    }
}
