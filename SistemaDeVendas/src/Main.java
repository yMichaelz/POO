import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private DefaultListModel<Cliente> clienteListModel;
    private DefaultListModel<Produto> produtoListModel;
    private DefaultListModel<Pedido> pedidoListModel;

    public Main() {
        // Configurações da Janela
        setTitle("Sistema de Vendas Online");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Modelos para as listas
        clienteListModel = new DefaultListModel<>();
        produtoListModel = new DefaultListModel<>();
        pedidoListModel = new DefaultListModel<>();

        // Painéis de Listas
        JList<Cliente> clienteJList = new JList<>(clienteListModel);
        JList<Produto> produtoJList = new JList<>(produtoListModel);
        JList<Pedido> pedidoJList = new JList<>(pedidoListModel);

        // Painel de Botões e Campos de Entrada
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(8, 2));

        // Componentes de Cliente
        JTextField clienteNomeField = new JTextField();
        JTextField clienteCpfField = new JTextField();
        JButton addClienteButton = new JButton("Adicionar Cliente");

        // Componentes de Produto
        JTextField produtoNomeField = new JTextField();
        JTextField produtoPrecoField = new JTextField();
        JTextField produtoCodigoField = new JTextField();
        JButton addProdutoButton = new JButton("Adicionar Produto");

        // Componentes de Pedido
        JButton addPedidoButton = new JButton("Criar Pedido");

        // Adiciona componentes ao painel de controle
        controlPanel.add(new JLabel("Nome do Cliente:"));
        controlPanel.add(clienteNomeField);
        controlPanel.add(new JLabel("CPF do Cliente:"));
        controlPanel.add(clienteCpfField);
        controlPanel.add(addClienteButton);

        controlPanel.add(new JLabel("Nome do Produto:"));
        controlPanel.add(produtoNomeField);
        controlPanel.add(new JLabel("Preço do Produto:"));
        controlPanel.add(produtoPrecoField);
        controlPanel.add(new JLabel("Código do Produto:"));
        controlPanel.add(produtoCodigoField);
        controlPanel.add(addProdutoButton);

        controlPanel.add(addPedidoButton);

        // Adiciona Listas e Painel de Controle à Janela
        add(new JScrollPane(clienteJList), BorderLayout.WEST);
        add(new JScrollPane(produtoJList), BorderLayout.CENTER);
        add(new JScrollPane(pedidoJList), BorderLayout.EAST);
        add(controlPanel, BorderLayout.SOUTH);

        // Ações dos Botões
        addClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = clienteNomeField.getText();
                String cpf = clienteCpfField.getText();
                Cliente cliente = new Cliente(nome, cpf);
                clienteListModel.addElement(cliente);
                clienteNomeField.setText("");
                clienteCpfField.setText("");
            }
        });

        addProdutoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = produtoNomeField.getText();
                double preco = Double.parseDouble(produtoPrecoField.getText());
                String codigo = produtoCodigoField.getText();
                Produto produto = new Produto(nome, preco, codigo);
                produtoListModel.addElement(produto);
                produtoNomeField.setText("");
                produtoPrecoField.setText("");
                produtoCodigoField.setText("");
            }
        });

        addPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = clienteJList.getSelectedValue();
                Produto produto = produtoJList.getSelectedValue();
                if (cliente != null && produto != null) {
                    Pedido pedido = new Pedido(cliente);
                    pedido.adicionarProduto(produto);
                    cliente.adicionarPedido(pedido);
                    pedidoListModel.addElement(pedido);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
