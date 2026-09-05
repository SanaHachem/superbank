public class Principal {
    
    public static void main(String[]args) {
        Corrente corrente = new Corrente(1.1, 0.0);
        corrente.setDeposito(1002);
        corrente.nDeposito(corrente.getDeposito());
    }
}
