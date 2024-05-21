import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota:");
        double nota3 = scanner.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.println(media);
    }
}
