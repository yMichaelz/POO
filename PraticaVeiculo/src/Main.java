public class Main {
    public static void main(String[] args) {

        //Criando Objeto moto, que deriva de veículo
        Moto Fazer = new Moto();
        Fazer.ano = 2023;
        Fazer.marca = "Yamahha";
        Fazer.modelo = "Fazer 250";
        Fazer.cilindradas = 250;

        Fazer.mover();
        Fazer.exibirDetalhes();
        //fim do objeto moto

        //Criando objeto carro
        Carro Logan = new Carro();
        Logan.quantidadePortas = 4;
        Logan.marca = "Renault";
        Logan.ano = 2013;
        Logan.modelo = "Logan 1.6";

        Logan.mover();
        Logan.exibirDetalhes();
        //fim do objeto carro



    }
}
