import java.sql.SQLOutput;

public class contaBancaria {
    private int numeroConta;
    private String agencia;
    private String titular;
    private double saldo;
    private double depositoInicial;

    public contaBancaria(int numeroConta, String agencia, String titular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 237.48;
    }

    public contaBancaria(int numeroConta, String agencia, String titular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public String getMensagemBoaVindas(){
        return "Olá " + titular +
                ", obrigado por criar uma conta em nosso banco \n" +
                "Agência: " + agencia +
                " | Conta: " + numeroConta +
                " | Saldo: R$" + saldo;
    }

}
