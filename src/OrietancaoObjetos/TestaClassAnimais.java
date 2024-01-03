
package OrietancaoObjetos;

import OrietancaoObjetos.Animais;
import java.util.Scanner;


public class TestaClassAnimais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animais animal = new Animais();

        System.out.println("Bem vindo ao bichinho virtual");
        System.out.println("Digite o nome do seu bichinho para ele nascer");
        System.out.println("");
         animal.nascer();
         
         
        
         
        int contador = 1; 
        while(contador != 4){
            if(animal.getCalorias() <= 0 || animal.getForça() <= 0){
                System.out.println(animal.morrer());
                break;
            }
            
            System.out.println("");
            System.out.println("o que voce quer fazer com seu bichinho");
            
            System.out.println("1 - Comer");
            System.out.println("2 - Correr");
            System.out.println("3 - Dormir");
            System.out.println("4 - para sair");
            int variavelTemporaria = input.nextInt();
            
            switch(variavelTemporaria){
                case 1:
                    System.out.println(animal.comer());
                    break;
                case 2:
                    System.out.println(animal.correr());
                    break;
                case 3:
                    System.out.println(animal.dormir());
                     break;
                case 4:
                    System.out.println("Vou finalizar sua Sessao");
                    contador = 4;
                    break;
                     
            }
        }
    }
    
}
