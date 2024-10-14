
package Aplicacao;

import java.util.Scanner;

public class RecolhaDeDadosDoCidadao {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        String nome = ler.nextLine();
        
        System.out.println("Digite o Sexo");
        String Sexo = ler.nextLine();
        
        System.out.println("Digite o Seu estado civil");
        String EstadoCivil = ler.nextLine();
        
        System.out.println("Digite a Idade:");
        int Idade = ler.nextInt();
        
        pessoa p = new pessoa(nome, Sexo, EstadoCivil, Idade);
        
        p.Consulta();
        
        
    }
    
}
