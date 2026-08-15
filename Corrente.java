public class Corrente extends conta {

    public double depositar() {
        return 10.000;
    }

    public double sacar() {
        return 5.000;
    }

    public void abrirConta() {
        this.setNumbank (001);
        this.setNumero (10.114);

        System.out.println("Sua conta é: " + this.getNumbank());
    }
}
