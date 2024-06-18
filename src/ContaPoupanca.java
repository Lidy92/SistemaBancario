public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }

        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }

        saldo -= valor;
    }


    @Override
    public void extrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.extrato();
    }

    public String saldo() {
        return "Saldo da Conta Poupança: R$ " + getSaldo(); //retorna o saldo
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor a ser transferido deve ser maior que zero.");
        }

        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência.");
        }

        super.transferir(valor, contaDestino); // chama o método da superclasse
    }

}
