
package OrietancaoObjetos;
import java.util.Scanner;

public class Conta {
Scanner input = new Scanner(System.in);    
    int numero;
    double saldo;
    boolean especial;
    double limite;
    
    void MostrarSaldo(){
        if(saldo > 0){
            System.out.println("Você tem "+saldo+" em sua conta");
            
        }else
            System.out.println("Nao tem saldo disponivel");
        
        return;
        
    }
    
    void Sacar(double QuantiaASacar){
        if(saldo >= QuantiaASacar){
            saldo -= QuantiaASacar;
            System.out.println("A quantidade Sacada "+QuantiaASacar);
        }else
            System.out.println("Saldo insuficiente");
    }
    
    
    void Depositar(){
        System.out.println("Quantos voce quer depositar");
         double Valor = input.nextInt();
         double deposito = saldo -  Valor;
         System.out.println("O Restante do saldo em sua conta foi: "+deposito);
            
                 
    }
    
    }
    

