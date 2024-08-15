public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Notebook", 3500.00, "001");
        Produto p2 = new Produto("Smartphone", 2000.00, "002");

        // Criando cliente
        Cliente c1 = new Cliente("João Silva", "123.456.789-00");

        // Criando pedido e associando produtos
        Pedido pedido1 = new Pedido(c1);
        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);

        // Associando pedido ao cliente
        c1.adicionarPedido(pedido1);

        // Listando pedidos do cliente
        System.out.println("Pedidos de " + c1.getNome() + ":");
        for (Pedido pedido : c1.getPedidos()) {
            System.out.println(pedido);
        }
    }
}
