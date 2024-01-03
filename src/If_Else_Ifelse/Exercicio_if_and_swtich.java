
package If_Else_Ifelse;
import java.util.Scanner;
    
public class Exercicio_if_and_swtich {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);  
        System.out.println("digite a nota do aluno 1");
       double nota1 = input.nextDouble();
        System.out.println("digite a segunda nota do aluno 1");
       double nota2 = input.nextDouble();
    
       double media = (nota1+nota2)/2;
      if(media == 10){
          System.out.println("Aprovado com distinção");
      }else if(media <7){
          System.out.println("Reprovado");
      }else if(media >= 7)
            System.out.println("Aprovado");
            
      
        
        
    }
}
