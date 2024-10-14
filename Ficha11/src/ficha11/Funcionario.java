
package ficha11;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double salario;
    private float tempoTrabalho;
    private int diasTrabalho;
    public static int numfunc;

    public Funcionario(String nome, double salario, float tempoTrabalho, int diasTrabalho)
    {
        this.nome = nome;
        this.salario = salario;
        this.tempoTrabalho = tempoTrabalho;
        this.diasTrabalho = diasTrabalho;
        numfunc++;
    }

    public Funcionario()
    {
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getSalario()
    {
        return this.salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public float getTempoTrabalho()
    {
        return this.tempoTrabalho;
    }

    public void setTempoTrabalho(float tempoTrabalho)
    {
        this.tempoTrabalho = tempoTrabalho;
    }

    public int getdiasTrabalho()
    {
        return this.diasTrabalho;
    }

    public void setDiasTrabalho(int diasTrabalho)
    {
        this.diasTrabalho = diasTrabalho;
    }


    public String toString()
    {
        return "Nome:"+ this.nome + "\n" + "Salario:" +this.salario +"\n"
                +"Tempo de Trabalho:" +this.tempoTrabalho +"\n" +"Dias de Trabalho:" +this.diasTrabalho +"\n";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public static double Salario(int diasTrabalho, double tempoTrabalho)
    {
        return (diasTrabalho * tempoTrabalho);
    }
}
