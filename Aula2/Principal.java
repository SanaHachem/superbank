public class Principal {

    public static void main(String[] args) {

        Corrente corrente = new Corrente(1, 33, 0);

        System.out.println(corrente.verSaldo());

        corrente.nDeposito(500);

        System.out.println(corrente.verSaldo());

        corrente.nSaque(100);

        System.out.println(corrente.verSaldo());

        Poupanca poupanca = new Poupanca(2, 33, 1000);

        System.out.println(poupanca.verSaldo());

        poupanca.meuDeposito(200);

        System.out.println(poupanca.verSaldo());
    }
}
