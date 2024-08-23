import java.util.Scanner;
import java.util.Arrays;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor de Retangulo com capacidade inicial para 5 objetos
        Retangulo[] retangulos = new Retangulo[5];
        int count = 0;

        // Preenche as 5 primeiras posições do vetor
        while (count < retangulos.length) {
            System.out.println("Informe a largura e altura do Retângulo " + (count + 1) + ":");
            System.out.print("Largura: ");
            double largura = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            // Adiciona o novo Retangulo ao vetor
            retangulos[count] = new Retangulo(largura, altura);
            count++;
        }

        // Exibe as informações dos primeiros 5 retângulos
        System.out.println("\nInformações dos primeiros 5 Retângulos:");
        for (int i = 0; i < count; i++) {
            retangulos[i].exibirInformacoes();
        }

        // Expande o vetor para 10 posições
        retangulos = expandirVetor(retangulos, 10);

        // Preenche as novas 5 posições do vetor
        while (count < retangulos.length) {
            System.out.println("Informe a largura e altura do Retângulo " + (count + 1) + ":");
            System.out.print("Largura: ");
            double largura = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            // Adiciona o novo Retangulo ao vetor
            retangulos[count] = new Retangulo(largura, altura);
            count++;
        }

        // Classifica os retângulos por área em ordem crescente
        ordenarPorArea(retangulos, count);

        // Exibe os retângulos ordenados por área
        System.out.println("\nRetângulos ordenados por área:");
        for (int i = 0; i < count; i++) {
            retangulos[i].exibirInformacoes();
        }

        scanner.close();
    }

    // Método para expandir dinamicamente o vetor para um novo tamanho
    public static Retangulo[] expandirVetor(Retangulo[] vetor, int novoTamanho) {
        Retangulo[] novoVetor = Arrays.copyOf(vetor, novoTamanho);
        System.out.println("\nVetor expandido para " + novoTamanho + " posições.");
        return novoVetor;
    }

    // Método para ordenar os retângulos por área usando Bubble Sort
    public static void ordenarPorArea(Retangulo[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j].calcularArea() > vetor[j + 1].calcularArea()) {
                    Retangulo temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
