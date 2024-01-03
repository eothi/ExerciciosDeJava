package Arrays;
import java.util.Scanner;
    
public class Array3 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
    
    int []A = new int [10];
    int []B = new int [10];
    int []C = new int [10];
    
    
    for(int i =0; i<A.length;i++){
        System.out.println("Digite o valor da posicao " +(i+1)+" DE A");
        A[i] = input.nextInt();
        
    }
    for(int i =0; i<B.length;i++){
        System.out.println("Digite o valor da posicao " +(i+1)+" DE B");
        B[i] = input.nextInt();
    
    
    }
    for(int i =0; i<A.length;i++){
        C[i] = A[i] + B[i];
        System.out.println("Valores somados da tabela C "+C[i]);
    }
}
}