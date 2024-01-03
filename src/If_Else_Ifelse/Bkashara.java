package If_Else_Ifelse;
import java.util.Scanner;
    
public class Bkashara {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);  
        System.out.println("dite valor de a:");
        int a = input.nextInt();
        System.out.println("digire valro de b:");
        int b = input.nextInt();
        System.out.println("digite valor de c ");
        int c = input.nextInt();
        
int delta = (int) Math.pow(b,2) - 4*a*c;      
double x = (-(b) + (Math.pow(delta,1.0/2.0)))/(2*a); 
double x1 = (-(b) - (Math.pow(delta,1.0/2.0)))/(2*a);
double x0 = -(b) /(2*a);
        
  
    if(a == 0){
    System.out.println("valor de A nao pode ser igual a zero");
    return;
  
    }else if(delta <0){
        System.out.println("valor de delta: "+delta+"é negativo");
        return;
    }else if (delta == 0){
            System.out.println("possui apenas uma raiz: "+x0);
    }else
            System.out.println("valores das raizes são: "+x+"\n");
            System.out.println("valor da segunda raiz é: "+x1);
     
    
    

    }
    
}