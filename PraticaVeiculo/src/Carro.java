public class Carro extends Veiculo {
    int quantidadePortas;
    @Override
    public void exibirDetalhes(){
        System.out.printf(this.modelo, this.marca, this.ano, this.quantidadePortas);
    }
    @Override
    public void mover(){
        System.out.printf("Este carro está acelerando pela estrada");
    }
}
