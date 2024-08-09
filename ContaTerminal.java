import java.util.Scanner;

public class ContaTerminal {

    public static void main(final String[] args) {
        // Criação de um objeto Scanner para ler os dados via terminal
        final Scanner scanner = new Scanner(System.in);

        // Criando os atributos da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Exibindo mensagens e capturando os dados via terminal
        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        scanner.nextLine(); // Consumir a linha restante
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        // Exibindo os dados da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}

