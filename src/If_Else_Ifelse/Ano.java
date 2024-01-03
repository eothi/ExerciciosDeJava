package If_Else_Ifelse;
import java.util.Scanner;
    
public class Ano {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
        System.out.println("Digite um ano");
       int ano = input.nextInt();
        
       if((ano % 4) == 0){
            System.out.println("ano é bissexto");
       }else
            System.out.println("Ano nao é bissexto");
        
        
        
        
    }
}