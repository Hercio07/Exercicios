
package ficha11;

import java.util.Scanner;


public class ProcessaSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("Digite o nome do funcionario 1:");
        String nome = scanner.nextLine();

        System.out.println("Digite o Salario do funcionario 1:");
        double salario  = scanner.nextInt();
            
        System.out.println("Digite o Termpo de trabalho do funcionario 1:");
        float tempoTrabalho  = scanner.nextFloat();
        
        System.out.println("Digite o Dias de trabalho do funcionario 1:");
        int diasTrabalho  = scanner.nextInt();
        
        System.out.println("Digite o nome do funcionario 2:");
        String nome2 = scanner.nextLine();
        
        System.out.println("Digite o Salario do funcionario 2:");
        double salario2  = scanner.nextInt();
            
        System.out.println("Digite o Trmpo de Tempo de trabalho do funcionario 2:");
        float tempoTrabalho2  = scanner.nextFloat();
        
        System.out.println("Digite o Dias de trabalho do funcionario 2:");
        int diasTrabalho2  = scanner.nextInt();
        
        Funcionario funcionario1 = new Funcionario(nome, salario, tempoTrabalho, diasTrabalho);
        Funcionario funcionario2 = new Funcionario(nome2, salario2, tempoTrabalho2, diasTrabalho2);
        int totFunc = Funcionario.numfunc;

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        double salarioBonus =  Funcionario.Salario(diasTrabalho, salario);
        double Salarios = funcionario1.getSalario();
        double salarioTot = salarioBonus + Salarios;
        System.out.println("O salario total do "+funcionario1.getNome()+" apos os bonus é de: " + salarioTot);

        Boolean igual = funcionario1.equals(funcionario2);
        System.out.println("A questao de identidade entre os funcionarios é "+igual);
        System.out.println("NUmero total de Funcionarios: "+totFunc);

    }
}
