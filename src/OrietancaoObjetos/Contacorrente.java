
package OrietancaoObjetos;


public class Contacorrente {
    public static void main(String[]args){
        Conta conta = new Conta();
        
        conta.saldo=600;
        conta.especial = true;
        conta.limite = 400;
        conta.numero = 1;
        
        conta.Sacar(400);
    }
}
