package For;
import java.util.Scanner;
    
public class Tabuada {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
 
        System.out.println("Digite a tabuada que quer: ");
        int tabuada = input.nextInt();
       
        
        for(int i = 0; i <=10; i++){
        int mutiplicação = tabuada * i;
            System.out.println("Tabuada do "+tabuada+":"+i+"X"+mutiplicação);
    }
        
    
    }
}