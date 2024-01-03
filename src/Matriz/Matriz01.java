package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[][] A = new int[4][4];
        int b;
        for (int linha = 0; linha < A.length; linha++) {
            for (int coluna = 0; coluna < A[linha].length; coluna++) {
                A[linha][coluna] = random.nextInt(10);
                System.out.print( A[linha][coluna]+" ");
                

            }
            System.out.println();
        }
        int maior = 0;
        int i = 0;
        int j = 0;        
        for (int linha = 0; linha < A.length; linha++) {
            for (int coluna = 0; coluna < A[linha].length; coluna++) {
                if (A[linha][coluna] > maior) {
                    maior = A[linha][coluna];
                    i = linha;
                    j = coluna;
                }

            }

        }
        System.out.println("maior valor da matriz é " + maior);
         System.out.println("linha onde está " + (i+1));
         System.out.println("coluna onde está " + (j+1));
    }

}
