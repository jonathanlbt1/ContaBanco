import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var conta1 = new ContaTerminal();

        System.out.println("Por favor, digite seu nome completo :");
        String nome = sc.nextLine();
        conta1.setNomeCliente(nome);

        System.out.println("Por favor, digite o numero da conta: ");
        var conta = sc.nextInt();
        conta1.setNumero(conta);

        sc.nextLine();
        System.out.println("Por favor, digite o numero da agencia :");
        var agencia = sc.nextLine();
        conta1.setAgencia(agencia);

        System.out.println("Por favor, digite o seu saldo :");
        var saldo = sc.nextDouble();
        conta1.setSaldo(saldo);

        System.out.println(conta1);

    }
}
