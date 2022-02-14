public abstract class Conta implements IConta{

    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
        this.banco = banco;
    }

    public void atualizarBanco(Conta conta) {
        banco.setConta(conta);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaPassiva, double valor) {
        this.sacar(valor);
        contaPassiva.depositar(valor);
    }

    protected String imprimirExtrato() {
        return "Conta{" +
                "titula=" + getCliente().nome +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
