import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite true ou false");
        boolean valor1 = scanner.nextBoolean();

        System.out.println("Digite true ou false");
        boolean valor2 = scanner.nextBoolean();

        if(valor1 && valor2){
            System.out.println("Ambos true");
        }else {
            System.out.println("Ambos falsos ou divergentes");
        }
    }
}
