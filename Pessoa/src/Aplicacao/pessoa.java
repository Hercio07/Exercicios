
package Aplicacao;

public class pessoa {
    private String nome;
    private String Sexo;
    private String EstadoCivil;
    private int idade;
    
    public pessoa(){
        
    }
    
    public pessoa(String nome, String sexo, String EstadoCivil, int idade){
        this.nome = nome;
        this.Sexo = sexo;
        this.EstadoCivil = EstadoCivil;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void Consulta(){
        System.out.println(nome);
        
        if(Sexo == "M"){
            System.out.println("Masculino");
        } else if(Sexo == "F"){
            System.out.println("Femenino");
        }
        
        if(EstadoCivil == "S"){
            System.out.println("Solteiro:");
            
        }else if(EstadoCivil == "C"){
            System.out.println("Casado:");
        }else if(EstadoCivil == "D"){
            System.out.println("Divorcio:");
        }else if(EstadoCivil == "V"){
            System.out.println("Viuvo");
        }
        System.out.println("Idade: " +idade);
        
    }
    
    
}
