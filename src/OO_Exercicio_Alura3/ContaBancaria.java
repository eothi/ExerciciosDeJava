
package OO_Exercicio_Alura3;

import java.util.Scanner;


public class ContaBancaria {
    Scanner input = new Scanner(System.in);
    private int saldo;

    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
    public int depositar(){
        System.out.println("Digite o valor que o senhor deseja depositar");
        int valor = input.nextInt();
        saldo += valor;
        System.out.println(getSaldo());
        return saldo;
        
    }
}
