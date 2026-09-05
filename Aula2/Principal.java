
import java.util.Scanner;

public class Principal{

public static void main ( String[] args){

    Scanner teclado = new Scanner(System.in);

    //Iniciando o objeto da classe corrente

    Corrente corrente = new Corrente();

    System.out.println("Digite o seu nome: ");

    String nome = teclado.nextLine(); 

    System.out.println("Digite o seu cpf: ");

    String cpfcli = teclado.nextLine(); 

    corrente.setnomecli(nome);
    corrente.setcpfcli(cpfcli);


    corrente.abrirConta();
}
}