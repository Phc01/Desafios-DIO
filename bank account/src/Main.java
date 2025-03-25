//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        contaBancaria conta1 = new contaBancaria("12345", "João Silva", 1000);
        contaBancaria conta2 = new contaBancaria("67890", "Maria Souza", 500);

        conta1.transferir(conta2, 300);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}