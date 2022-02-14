import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        Banco banco = new Banco("bb", contas);

        Cliente cliente = new Cliente("Hilbert", "13/07/1997", null);

        Conta cc = new ContaCorrente(cliente, banco);
        cc.atualizarBanco(cc);
        cc.depositar(100.00);

        Conta cp = new ContaPoupanca(cliente, banco);
        cp.atualizarBanco(cp);

        cc.transferir(cp, 100.00);

        System.out.println(cc.imprimirExtrato());
        System.out.println(cp.imprimirExtrato());
        System.out.println(banco);

    }
}
