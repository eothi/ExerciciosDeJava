package For;
import java.util.Scanner;
    
public class Pais {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 

        System.out.println("digite a população pais A");
        int A = input.nextInt();
        System.out.println("digite a taxa de crescimento Pais A");
       double B = input.nextDouble();
        System.out.println("Digite popula~]ao pais B");
        int C = input.nextInt();
        System.out.println("Taxa crescimento pais B");
        double D = input.nextDouble();
       
        
        
    int cont = 0;
  while(A <  B){
      A += (A/100) * B;
      C += (C/100) * D;
      cont++;
  }
        System.out.println("foram nessario "+cont+" Anos");
        System.out.println("população A: "+A);
        System.out.println("população B: "+C);



        int x =5;
        System.out.println(x++);
    }
}
