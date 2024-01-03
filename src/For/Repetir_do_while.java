    package For;
import java.util.Scanner;
    
public class Repetir_do_while {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);  

       
       boolean x = false;
         System.out.println("Digite uma nota de 0 a 10"); 
        do{ 
        
        int valor = input.nextInt();
        
        if(valor >=0 && valor <=10){
        x = true;
            System.out.println("voce digitou: "+valor);
            
        
        }else
                System.out.println("digita a um valor entre 0 a 10");
        
        }while (x == false);
            
    }
}
