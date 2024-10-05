public class Veiculo {
    String marca;
    int ano;
    String modelo;

    public void exibirDetalhes(){
        System.out.printf(this.marca, this.modelo, this.ano);
    }

    public void mover(){
        System.out.println("Este veículo está se movendo");
    }
}
