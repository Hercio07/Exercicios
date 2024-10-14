
package Ficha9;

public class electrodomesticos {
    private String nome;
    private String modelo;
    private int anoFrabrico;
    private double preco; 
    
    
    public electrodomesticos(String nome, String modelo, int anoFrabrico, double preco){
        this.nome = nome;
        this.modelo = modelo;
        this.anoFrabrico = anoFrabrico;
        this.preco = preco;
        
        
   }
    public electrodomesticos(){
        
    }
    
    
    public void vizualizarElectrodomestico(){
        System.out.println("Nome:" +nome);
        System.out.println("Modelo:" +modelo);
        System.out.println("Ano de Fabrico:" +anoFrabrico);
        System.out.println("Preço:" +preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFrabrico() {
        return anoFrabrico;
    }

    public void setAnoFrabrico(int anoFrabrico) {
        this.anoFrabrico = anoFrabrico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

 
}
