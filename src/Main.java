public class Main {

    public static void main (String[] args) {

        Cliente jose = new Cliente();
        jose.setNome("Jose");

        Conta cc = new ContaCorrente(jose);
        Conta poupanca = new ContaPoupanca(jose);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
