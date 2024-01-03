package Matriz;

import java.util.Random;
import java.util.Scanner;

public class matriz02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        int soma = 0;
        int soma1 = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matriz[5].length; i++) {
            for (int j = 0; j < matriz[7].length; j++) {
            if(matriz[5][i] > soma){
                soma = matriz[5][i];
                linha = i;
         
            }
                
            }
        }
            System.out.println(soma);    
        System.out.println("posição "+linha);
            
     for (int i = 0; i < matriz[5].length; i++) {
            for (int j = 0; j < matriz[7].length; j++) {
            if(matriz[5][i] > soma1){
                soma1 = matriz[7][j];
                coluna = j;
         
            }
                
            }
     }
         System.out.println(soma1);
         System.out.println("coluna "+coluna);
    }
        
        }
