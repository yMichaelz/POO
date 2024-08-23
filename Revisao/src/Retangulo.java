public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return altura*largura;
    }

    public double calcularPerimetro(){
        return 2 * (altura+largura);
    }

    public void exibirInfor(){
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
