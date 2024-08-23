import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Definindo um novo Array (Questão 02)
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;

        //Encontrando a média de 10 valores (Questão 03)
        for(int i = 0; i < 10; i++){
            System.out.println("Diigite o " + (i+1) + " Número");
            double numero = scanner.nextDouble();
            numeros.add(numero);
            soma += numero;
        }

        double media = soma / numeros.size();
        System.out.println("A média dos valores informados é de: " + media);


    }
}