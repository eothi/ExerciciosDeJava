package If_Else_Ifelse;
import java.util.Scanner;


public class Genero_um_caractere {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);    
        
        System.out.println("Digite seu sexo");
        String x = input.nextLine();
        
        if(x.length() == 1 && x.equalsIgnoreCase("m")) {
            char y = x.charAt(0);
            System.out.println("o seu genero e masculino");
        }else if (x.length() == 1 && x.equalsIgnoreCase("f")){
            char z = x.charAt(0);
            System.out.println("O seu genero e femenino");
        }else
            System.out.println("Sexo nao identificado");
        
        
    
    }
}
  

