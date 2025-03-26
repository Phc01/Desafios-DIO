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

        System.out.println("\n--- OPERAÇÕES DISPONÍVEIS ---");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");

        int opcao;
        do {
            System.out.print("\nEscolha uma opção (1-4): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Seu saldo atual é: R$" + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso banco. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

}