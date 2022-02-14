import lombok.Setter;

@Setter
public class Cliente extends Pessoa{
    private Conta conta;

    public Cliente(String nome, String data_nascimento, Conta conta) {
        super(nome, data_nascimento);
        this.conta = conta;
    }
}
