package For;
import java.util.Scanner;
    
public class Usario_Senha {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);  

boolean x = true;

    
   
    

do{
    System.out.println("Digite seu usario");
    String usario = input.next();
     System.out.println("digite sua senha");
    String senha = input.next();
    if(!usario.equals(senha)){
    System.out.println("acesso valido");
    return;
    }else if(usario.equals(senha)){
    System.out.println("acesso invalido, digite novamente");
    
    x = false;
}
       
}while (x == false);







    }
}
