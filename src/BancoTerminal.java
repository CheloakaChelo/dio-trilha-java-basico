import java.util.*;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ContaBanco contaBanco = new ContaBanco();

        System.out.println("Digite o número da conta");
        int numero = sc.nextInt();
        contaBanco.setNumero(numero);

        System.out.println("Digite o número da agencia");
        int agencia = sc.nextInt();
        contaBanco.setAgencia(agencia);

        System.out.println("Digite o seu nome");
        String cliente = sc.next();
        contaBanco.setCliente(cliente);

        System.out.println("Conta criada, " + contaBanco.getCliente() + "! Bem vindo ao nosso banco! Sua agência é "+ contaBanco.getAgencia() + ", conta " + contaBanco.getNumero() + 
        " e saldo "+ contaBanco.getSaldo() +" disponível na sua conta para saque!");
    }
}
