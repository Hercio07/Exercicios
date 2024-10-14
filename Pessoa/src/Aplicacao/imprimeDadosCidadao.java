
package Aplicacao;


public class imprimeDadosCidadao {

  
    public static void main(String[] args) {
        // TODO code application logic here
        pessoa p1 = new pessoa("Alberth", "M", "C", 34);
        pessoa p2 = new pessoa("Rhosty", "F", "S", 27);
        pessoa p3 = new pessoa("Phaula", "F", "V", 72);
        
        p1.Consulta();
        p2.Consulta();
        p3.Consulta();  
     
    }
    
}
