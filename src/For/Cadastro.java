package For;
import java.util.Scanner;
    
public class Cadastro {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);  

    boolean x = true;
    boolean x1 =true;
    String nome;
    do{
        System.out.println("digite seu nome com mais de 3 caractere");
        nome = input.next();
       
        if(nome.length() >= 3){
          x = false;
                      System.out.println("nome valido");

            
        }else
            System.out.println("Nome Invalido");
            
        
       }while(x);
        
    int idade;
       do{
        System.out.println("digite sua idade");
        idade = input.nextInt();
        if(idade >=0 && idade <= 150){
            x1 = false;
  
        }else
            System.out.println("idade valida");
            
    }while(x1 == true);
       
       int salario;
       boolean x2 = true;
       do{
           System.out.println("digite seu salario");
          salario = input.nextInt();
          if(salario >0){
              x2 = false;
       }else
               System.out.println("salario valido");
       }while(x2);
       
      String sexo;
      boolean x3 = true;
      do{
          System.out.println("digte seu sexo");
          sexo = input.next();
          if(sexo.length () == 1 && sexo.equalsIgnoreCase("M")){
          char y = sexo.charAt(0);
          x3 = false;
              System.out.println("Masculino");
      }else if(sexo.length () == 1 && sexo.equalsIgnoreCase("F")){
          char z = sexo.charAt(0);
          x3 = false;
              System.out.println("Feminino");
      }else
              System.out.println("Sexo invalido");
      }while(x3);
      
       
    }
}
    
    
    
    
    
    
    
    
    
