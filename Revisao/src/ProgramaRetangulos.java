import java.util.Scanner;
import java.util.Arrays;

public class ProgramaRetangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor de Retangulo com capacidade inicial para 5 objetos
        Retangulo[] retangulos = new Retangulo[5];
        int count = 0;

        // Loop para adicionar retângulos ao vetor
        while (true) {
            System.out.println("Informe a largura e altura do Retângulo " + (count + 1) + ":");
            System.out.print("Largura: ");
            double largura = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            // Verifica se o vetor está cheio, e se necessário, expande-o
            if (count == retangulos.length) {
                retangulos = expandirVetor(retangulos);
            }

            // Adiciona o novo Retangulo ao vetor
            retangulos[count] = new Retangulo(largura, altura);
            count++;

            // Pergunta se o usuário deseja adicionar mais retângulos
            System.out.print("Deseja adicionar outro retângulo? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                break;
            }
        }

        // Exibe as informações de cada retângulo
        System.out.println("\nInformações dos Retângulos:");
        for (int i = 0; i < count; i++) {
            retangulos[i].exibirInfor();
        }

        // Classifica os retângulos por área em ordem crescente
        ordenarPorArea(retangulos, count);

        // Exibe os retângulos ordenados por área
        System.out.println("Retângulos ordenados por área:");
        for (int i = 0; i < count; i++) {
            retangulos[i].exibirInfor();
        }

        scanner.close();
    }

    // Método para expandir dinamicamente o vetor
    public static Retangulo[] expandirVetor(Retangulo[] vetor) {
        Retangulo[] novoVetor = Arrays.copyOf(vetor, vetor.length * 2);
        System.out.println("Vetor expandido para " + novoVetor.length + " posições.");
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
