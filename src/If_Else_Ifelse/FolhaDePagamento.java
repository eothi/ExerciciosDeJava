    package If_Else_Ifelse;
import java.util.Scanner;
public class FolhaDePagamento {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
//      EXERCIO NUMERO 08
        /*System.out.println("digite o valor do produto 1");
        int produto1 = input.nextInt();
        System.out.println("digite o valor do produto 2");
        int produto2 = input.nextInt();
        System.out.println("digite o valor do produto 3");
        int produto3 = input.nextInt();
            
        if(produto1 < produto2 && produto1 <produto3){
            System.out.println("comprar produto 1");
        }else if(produto2 <produto1 && produto2 < produto3){
            System.out.println("Comrpar produto 2");
            
        }else
            System.out.println("comprar produto 3");
       */
        double Des5 = 0.05;
        double Des10 = 0.1;
        double Des20 = 0.2;
       
        
        System.out.println("valor da hora: ");
        int valueHora = input.nextInt();
        System.out.println("horas trabalha no mes");
        int valueHtotais = input.nextInt();
        int salariobruto = valueHora*valueHtotais;     
       
    if(salariobruto >900 && salariobruto <= 1500){
    double x = salariobruto*Des5;
 }else if(salariobruto > 1500 && salariobruto <=2500){
     double y = salariobruto*Des10;
 }else if(salariobruto > 2500){
     double z = salariobruto*Des20;
 }
    
 
    
        System.out.println("Salario Bruto: ("+valueHora+"*"+valueHtotais+") : "+salariobruto);
        if(salariobruto >900 && salariobruto <= 1500){
             double x = salariobruto*Des5;
            System.out.println("(-) IR (5%)  : R$ "+x);
        }else if(salariobruto > 1500 && salariobruto <=2500){
     double y = salariobruto*Des10;
            System.out.println("(-) IR (10%)  : R$ "+y);
 }      else if(salariobruto > 2500){
     double z = salariobruto*Des20;
            System.out.println("(-) IR (20%)  : R$ "+z);
    }
      double inss = salariobruto*0.1;
        System.out.println("(-) INSS (10%)  : R$ "+inss);
        
        double fgts = salariobruto*0.11;
        System.out.println("(-) FGTS (11%)  : R$ "+fgts);
        
         if(salariobruto >900 && salariobruto <= 1500){
             double x = salariobruto*Des5;
             double DescontoT =(inss+x);
            System.out.println("Total de desconto  : R$ "+DescontoT);
        }else if(salariobruto > 1500 && salariobruto <=2500){
     double y = salariobruto*Des10;
             double DescontoT =(inss+y);
            System.out.println("Total de desconto  : R$ "+DescontoT);
          }else if(salariobruto > 2500){
                double y = salariobruto*Des20;
             double DescontoT =(inss+y);
            System.out.println("Total de desconto  : R$ "+DescontoT);
    
          }
           if(salariobruto >900 && salariobruto <= 1500){
             double x = salariobruto*Des5;
             double Liquido =salariobruto-x-inss;
            System.out.println("Salario liquido  : R$ "+Liquido);
        }else if(salariobruto > 1500 && salariobruto <=2500){
             double o = salariobruto*Des10;
              double Liquido =salariobruto-o-inss;
            System.out.println("Salario liquido  : R$ "+Liquido);
          }else if(salariobruto > 2500){
                double z = salariobruto*Des20;
            double Liquido =salariobruto-z-inss;
            System.out.println("Salario liquido  : R$ "+Liquido);
          
          }
          
    }
}
          
          
          
          
          
          
    
    
    
    
    
    
    

    
