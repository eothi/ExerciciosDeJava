
package Arrays_Object;

/**
 *
 * @author thiag
 */
public class ProdutoPerecivel extends Produto{
    
    
    private String dataValide;

    public String getDataValide() {
        return dataValide;
    }
    
    
    
    public ProdutoPerecivel(String dataValide, String nome, int preco, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValide = dataValide;
    }
    
    public String toString(){
        return "Nome do produto: " + getNome() + " no valor de - " + getPreco() + " data de valdiade " + getDataValide();
    }
    
    
    
}
