package exercicios.praticando;
import java.util.Scanner;

/*
    1 - Faça um algoritmo que leia os
    valores de A, B, C e em seguida imprima na
    tela a soma entre A e B é mostre se a soma é menor que C.
 */

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.print("Insira o valor de A: ");
        A = sc.nextInt();
        System.out.print("Insira o valor de B: ");
        B = sc.nextInt();
        System.out.print("Insira o valor de C: ");
        C = sc.nextInt();

        int sum = A + B;
        System.out.println("A soma de A e B é: " + sum);
        if(sum < C){
            System.out.println("A soma é menor que C");
        } else if (sum > C){
            System.out.println("A soma é maior que C");
        }

        sc.close();
    }
}
