public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public String imprimirExtrato(){
        return "=== Conta Poupança === {" +
                "titular: " + super.getCliente().nome +
                ", agencia: " + super.agencia +
                ", numero: " + super.numero +
                ", saldo: " + super.saldo +
                '}';
    }

}
