
package OrietancaoObjetos;

import java.util.Scanner;


public class Animais {
    Scanner input = new Scanner(System.in);
    
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int calorias;
    private int força;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

   
    
    
    
    
    
    
    
    public void nascer(){
        System.out.println("Nome do Animal");
        this.nome = input.nextLine();
        System.out.println("");
        System.out.println("Nome da classe");
        this.classe = input.nextLine();
        System.out.println("");
        System.out.println("Nome da Familia");
        this.familia = input.nextLine();
        this.força = 10;
        this.calorias = 10;
        this.idade = 0;
        this.vivo = true;
        
    }
    
    
    
   public String morrer(){
       this.vivo = false;
       return "o "+this.nome+" Foi de arrasta pra cima";
   }
   
   public String comer(){
       System.out.println("");
       if(this.calorias != 100 || this.vivo == false)
           this.calorias +=10;
           this.força -= 2;
          
           return "o "+this.nome+" acabou de comer";
       
   
   }
   
   public String correr(){
       System.out.println("");
       if(this.vivo =! false || this.calorias == 0)
           this.força -= 5;
           this.calorias -= 5;
            return "o "+this.nome+" esta correndo sua força agora e "+this.força+
                   " e sua calorias e "+this.calorias;
          
      
   }
   public String dormir(){
       System.out.println("");
       if(this.vivo =! false)
           this.força += 10;
           this.calorias -= 2;
           
       return "O "+this.nome+" esta dormindo sua força agora e "+this.força+
                   " e sua calorias e "+this.calorias;
   }       
          
      
       
}

   
  




