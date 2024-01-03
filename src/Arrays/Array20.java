package Arrays;

import java.util.Scanner;

public class Array20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[20];
        double B;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor em dolar da posicao "+(i+1)+":" );
            B = input.nextDouble();
            A[i] = (int) B * 5;

        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Valores dos dolares " + A[i]);
        }
    }

}
