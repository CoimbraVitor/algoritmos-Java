import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();

        System.out.println(valor * 1.05);
    }
}
