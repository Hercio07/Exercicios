package Last;


import java.util.Objects;

public class Funcionario {

    public static int getTotfunc() {
        return totfunc;
    }

    public static void setTotfunc(int aTotfunc) {
        totfunc = aTotfunc;
    }
    private String nome;
    private int diasTrabalhados;
    private double valorDiario;
    private static int totfunc = 0;

    public Funcionario(String nome, int diasTrabalhados, double valorDiario) {
        this.nome = nome;
        this.diasTrabalhados = diasTrabalhados;
        this.valorDiario = valorDiario;
        totfunc++;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }

    

    public double calculaSalario() {
        return diasTrabalhados * valorDiario;
    }

    public static double calculaSalario(int diasTrabalhados, double valorDiario) {
        return diasTrabalhados * valorDiario;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario funcionario = (Funcionario) obj;
        return diasTrabalhados == funcionario.diasTrabalhados &&
                Double.compare(funcionario.valorDiario, valorDiario) == 0 &&
                Objects.equals(nome, funcionario.nome);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", diasTrabalhados=" + diasTrabalhados +
                ", valorDiario=" + valorDiario +
                '}';
    }

    
    
}