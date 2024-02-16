
package Arrays_Object;

import java.util.ArrayList;


public class Principal_produto {
    
    public static void main(String[] args) {
        
        
        
        Produto produto = new Produto("Azeite", 20, 10);
        Produto produto1 = new Produto("carne", 24, 52);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("12/2024","pessego", 25, 59);
        
        ArrayList<Produto> lista_produto = new ArrayList<>();
        
        lista_produto.add(produto);
        lista_produto.add(produto1);
        lista_produto.add(produtoPerecivel);
        
        
        System.out.println(lista_produto.indexOf(1));
        System.out.println(lista_produto.size());
        System.out.println(lista_produto);
        
        
      
        
    }
    
}
