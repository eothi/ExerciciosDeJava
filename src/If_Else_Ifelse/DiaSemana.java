package If_Else_Ifelse;
import java.util.Scanner;
    
public class DiaSemana {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);  
    
        System.out.println("digite um numero: ");
        int numero = input.nextInt();
        
        
        switch(numero){
        case 1: System.out.println("domingo");break;
        case 2: System.out.println("Segunda");break;
        case 3: System.out.println("terça");break;
        case 4: System.out.println("quarta");break;
        case 5: System.out.println("quinta");break;
        case 6: System.out.println("sexta");break;
        case 7: System.out.println("sabado");break;
        default: System.out.println("numero invalido");
        
        }
        
        
    
    
    
    
    
    
    }
}
