package Arrays;
import java.util.Scanner;
    
public class Array {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 


int [] VetorA = new int [5];
int [] VetorB = new int [VetorA.length];


for(int i = 0; i < VetorA.length; i++){
    System.out.println("Entra com valor na tabela: ");
    VetorA[i] = input.nextInt();
    VetorB[i] = VetorA[i];
    
}
for(int i = 0; i <VetorA.length; i++){
    System.out.println("Valores de A: "+VetorA[i]);

}       
for(int i = 0; i <VetorB.length; i++){
    System.out.println("Valores de B: "+VetorB[i]);
}
    }
}