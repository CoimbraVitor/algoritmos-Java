import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        int valor = scanner.nextInt();

        int antecessor = valor - 1 ;
        int sucessor = valor + 1;

        System.out.println(antecessor);
        System.out.println(sucessor);
    }
}
