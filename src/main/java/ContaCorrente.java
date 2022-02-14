public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public String imprimirExtrato(){
        return "=== Conta Corrente === {" +
                "titular: " + super.getCliente().nome +
                ", agencia: " + super.agencia +
                ", numero: " + super.numero +
                ", saldo: " + super.saldo +
                '}';
    }

}
