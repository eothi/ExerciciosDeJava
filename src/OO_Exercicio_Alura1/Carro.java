
package OO_Alura1;


public class Carro {
    private String nomeCarro;
    private int ano;
    private int ano2;
    private int ano3;
    private int preço;
    private int preço2;
    private int preço3;
    
    
    
    
    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String celta) {
        this.nomeCarro = celta;
    }
    
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno2() {
        return ano2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public int getAno3() {
        return ano3;
    }

    public void setAno3(int ano3) {
        this.ano3 = ano3;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getPreço2() {
        return preço2;
    }

    public void setPreço2(int preço2) {
        this.preço2 = preço2;
    }

    public int getPreço3() {
        return preço3;
    }

    public void setPreço3(int preço3) {
        this.preço3 = preço3;
    }
    
    
    
    
    public void mostraNomeDoCarro(){
        setNomeCarro("celta");
        System.out.println(getNomeCarro());
        
        
        
    }
    
    public void mostraAnoDoCarro(){
        setAno(2007);
        setAno2(2008);
        setAno3(2009);
        System.out.println("o carro "+nomeCarro+" esta disponivel do ano "+getAno()+" "+getAno2()+" "+getAno3());
    }
    
    public void mostraPreçoPorAno(){
        setPreço(7500);
        setPreço2(9000);
        setPreço3(10000);
        System.out.println("Preco medio do "+this.nomeCarro+" no ano "+getAno()+" e "+getPreço());
        System.out.println("Preco medio do "+this.nomeCarro+" no ano "+getAno2()+" e "+getPreço2());
        System.out.println("preço medio do "+this.nomeCarro+" no ano "+getAno3()+" e "+getPreço3());
        
    }
    
    public void exbirMenorPreço(){
        if(getPreço() < getPreço2()){
            System.out.println("Valor do carro do ano "+getAno()+" e menor");
        }else if(getPreço2() < getPreço3()){
            System.out.println("Valor do carro do ano "+getAno2()+" e menor");

        }else{
             System.out.println("Valor do carro do ano "+getAno3()+" e menor");

        }
    }
        
     public void exbirMaiorPreço(){
        if(getPreço() > getPreço2()){
            System.out.println("Valor do carro do ano "+getAno()+" e maior");
        }else if(getPreço2() > getPreço3()){
            System.out.println("Valor do carro do ano "+getAno2()+" e maior");

        }else{
             System.out.println("Valor do carro do ano "+getAno3()+" e maior");

        }
    }
    
    
    
    

}

