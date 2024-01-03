
package If_Else_Ifelse;
import java.util.Scanner;

public class Vogal_Consoante {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("digite um caractere");
        char ch = input.next().charAt(0);
    
   if(ch == 'a' ||  ch =='e' ||  ch == 'i' || ch == 'o' || ch == 'u'){
       System.out.println("Valor digitado é uma vogal: "+ch);
   }else
            System.out.println("valor digitado é uma consoante: "+ch);
    
    
      

       //jeito da professora
        System.out.println("Digite um caractere");
        String letra = input.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("O"
                ) || letra.equalsIgnoreCase("U")){
            System.out.println("Vogal");
        }else
            System.out.println("Consoante: "+letra);
        }
            
    }
