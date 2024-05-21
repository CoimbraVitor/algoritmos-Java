import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número");
        int numero = leitura.nextInt();


        if(numero % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }
    }
}
