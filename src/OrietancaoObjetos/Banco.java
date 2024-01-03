
package OrietancaoObjetos;


public class Banco {
    private String agencia;
    private String banco;
    private int tipo;
    private int ag_numero;
    private int numero;
    private int saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAg_numero() {
        return ag_numero;
    }

    public void setAg_numero(int ag_numero) {
        this.ag_numero = ag_numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    
    
    public int creditar(int valor){
        if(this.tipo != 4)
            this.saldo += valor;
            return valor;
    }
    
    public int debitar(int valor){
        if(this.tipo != 4)
            this.saldo -= valor;
            return valor;
    }



        


    
}

