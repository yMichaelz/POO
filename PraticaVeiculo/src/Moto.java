public class Moto extends Veiculo{
    int cilindradas;
    @Override
    public void mover(){
        System.out.printf("A moto está passando pelos corredores do transito");
    }
    @Override
    public void exibirDetalhes(){
        System.out.printf(this.modelo, " - ", this.marca, " - ",   this.ano, " - ", this.cilindradas);
    }

}
