import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        this.total += produto.getPreco();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido [Cliente: " + cliente.getNome() + ", Total: R$" + total + "]";
    }
}
