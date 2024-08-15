import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Pedido> pedidos;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return "Cliente [Nome: " + nome + ", CPF: " + cpf + "]";
    }
}
