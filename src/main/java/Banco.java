import java.util.Arrays;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Conta conta : contas) {
            stringBuilder.append("\n\t\t")
                    .append("Número da conta: " + conta.numero)
                    .append(", Cliente: " +conta.cliente.nome)
                    .append(", Saldo: "+conta.saldo)
                    .append(", Tipo: "+ Arrays.toString(conta.getClass().getName().split("(?<!^)(?=[A-Z])")));
        }

        return "Banco " +
                nome +
                ", \n\tcontas=" + stringBuilder+
                '}';
    }
}
