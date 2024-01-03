package Arrays;
import java.util.Scanner;

public class Array12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int [] a = new int [10];
          System.out.println("digite 10 valores na tabela: ");
        for(int i = 0; i < a.length; i++){
            System.out.println("diigte na posicao: "+(i+1));
            a[i] = input.nextInt();
            
        }
    int soma = 0;
     
     for(int i = 0; i < a.length; i++){
      soma = soma + a[i];
         
     }
        System.out.println("Soma total dos valores da tabela sao: "+soma);
    }
    
}
