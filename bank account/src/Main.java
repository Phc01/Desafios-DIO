import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM-VINDO AO BANCO DIGITAL \n");

        // Coletar dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String titular = scanner.nextLine();

        System.out.println("Deseja fazer um depósito inicial? (S/N): ");
        String opcaoDeposito = scanner.nextLine();

        contaBancaria conta;

        if (opcaoDeposito.equals("S")) {
            System.out.println("Digite o valor do depósito inicial: R$");
            double depositoInicial = scanner.nextDouble();
            conta = new contaBancaria(numeroConta, agencia, titular, depositoInicial);
        } else {
            conta = new contaBancaria(numeroConta, agencia, titular);
        }

        System.out.println("\n" + conta.getMensagemBoaVindas());

    }
}