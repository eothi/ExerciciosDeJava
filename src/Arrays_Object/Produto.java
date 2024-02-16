
package Arrays_Object;
import java.util.ArrayList;


public class Produto {
        
    
    private String nome;
    private int preco;
    private int qunatidade;

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQunatidade() {
        return qunatidade;
    }
    
    
    
    
    public Produto(String nome, int preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.qunatidade = quantidade;
    }
    
    
    public String toString(){
        return "Nome do produto: " + getNome() + " no valor de - " + getPreco();
    }
    
    
   
    
   

 }


     
