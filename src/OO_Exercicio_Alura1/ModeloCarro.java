
package OO_Exercicio_Alura1;


public class ModeloCarro extends Carro{
    
    private float potenciaMotor;
    private boolean automatico;
    private boolean arcondicionado;

    public float getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(float potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }
    
    
    
    
    public void mostraFichaCarro(){
        System.out.println("");
        mostraNomeDoCarro();
        setArcondicionado(true);
        System.out.println("O "+getNomeCarro()+" tem arcondicionado: "+isArcondicionado());
        setAutomatico(false);
        System.out.println("O "+getNomeCarro()+" e automatico: "+isAutomatico());

        
    }
    
}
