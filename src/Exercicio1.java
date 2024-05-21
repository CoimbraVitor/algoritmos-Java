import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
        Scanner leitura = new  Scanner(System.in);

        System.out.println("Input A");
        double a = leitura.nextDouble();
        System.out.println("Input B");
        double b = leitura.nextDouble();
        System.out.println("Input C");
        double c = leitura.nextDouble();

        double soma = a + b;
        System.out.println("Soma: " + soma);

        if(soma > c){
            System.out.println("A soma é maior do que C");
        }else {
            System.out.println("A soma é menor do que C");
        }

    }
}
