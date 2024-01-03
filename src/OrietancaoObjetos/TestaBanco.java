
package OrietancaoObjetos;

import OrietancaoObjetos.Banco;


public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        banco.creditar(200);
        banco.debitar(50);
        System.out.println(banco.getSaldo());
        
        
    }
    
}
