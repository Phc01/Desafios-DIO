import java.sql.SQLOutput;

public class contaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public contaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor insuficiente ou valor inválido para saque.");
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void transferir(contaBancaria destino, double valor) {
        if (valor > 0 && saldo >- valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " para " + destino + " relizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para trasferência.");
        }
    }
}
