package Arrays;

import java.util.Scanner;
public class Array11{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 10 elementos numeros na tabela:");
        int [] a = new int [10];
      int i;
        for( i = 0; i <a.length; i++){
             System.out.println("Digite o valor da posiçao "+(i+1)+".");
            a[i] = input.nextInt();
           
           
            
        }
        for(int pos = 0; pos <a.length; pos++){
            if(a[pos] %2 == 0)
                System.out.println("Valores impares sao: "+a[pos]+" que estao na posicao: "+(pos+1));
        }
       
            
    }
}
        