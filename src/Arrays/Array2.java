package Arrays;
import java.util.Scanner;
    
public class Array2 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
int [] A = new int [8];
int [] B = new int [A.length];

for(int i = 0; i < A.length; i++){
    System.out.println("digite os valores de vetor A");
    A[i] = input.nextInt();
    
}
for(int i = 0; i < B.length; i++){
B[i] = A[i]*2;

} 
for(int i = 0; i < B.length; i++){
    System.out.println(B[i]);
}   

    }
}
