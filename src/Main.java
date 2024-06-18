public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(100);  //aqui voce coloca o valor, vou deixa de exemplo
        cp.depositar(100);  //aqui voce coloca o valor, vou deixa de exemplo

        try {
            cc.sacar(30); // saca R$ 30 da conta corrente
            cp.sacar(20); // saca R$ 20 da conta poupança
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo()); // Saída esperada: 70.0
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo()); // Saída esperada: 80.0
    }
}
