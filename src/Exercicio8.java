import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valor1 = scanner.nextInt();
        System.out.println("Digite um valor inteiro:");
        int valor2 = scanner.nextInt();
        System.out.println("Digite um valor inteiro:");
        int valor3 = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();
        lista.add(valor1);
        lista.add(valor2);
        lista.add(valor3);

        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);

    }
}
