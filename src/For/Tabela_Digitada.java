package For;
import java.util.Scanner;
    
public class Tabela_Digitada {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 

        System.out.println("digite o valor dos paes: ");
        double pao = input.nextDouble();
        int i;
        double soma =  0;
        
        
        for(i =1; i<=50;i++)
         soma += pao ;
        
            System.out.println(i+" - R$ "+ soma);
        }
    
    
    
    }
