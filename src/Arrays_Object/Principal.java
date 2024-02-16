
package Arrays_Object;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        
        
        Pessoa pessoa1 =  new Pessoa("thiago", 20);
        Pessoa pessoa2 = new Pessoa("Marcelo", 27);
        Pessoa pessoa3 = new Pessoa("Stephanie",24);
        
        
        
        
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        
        listaDePessoas.size();
        System.out.println(listaDePessoas.get(0));
        
        System.out.println(listaDePessoas);
        System.out.println(listaDePessoas.toString());
        
         for (Pessoa pessoa: listaDePessoas){
             System.out.println(pessoa);
         }
    }
}
