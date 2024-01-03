package Arrays;

import java.util.Scanner;

public class Array15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("Digite 10 valores na tabela:");

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor na posiçao: " + (i + 1));
            A[i] = input.nextInt();

        }
        int soma = 0;
for (int i = 0; i < A.length; i++) {
    if(A[i] <15){
    soma = A[i]  + soma;
    System.out.println("Soma dos valores das posicoes "+(i+1)+" e "+soma);
    }
    }
    
    
for (int i = 0; i < A.length; i++) {
if(A[i] == 15)
        System.out.println("Quantiade de elementos amerzanados sao "+A[i]);

}   
  
      
        System.out.println(soma);
}
    }

