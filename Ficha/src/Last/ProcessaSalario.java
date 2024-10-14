package Last;

import java.util.Scanner;

public class ProcessaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário 1: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite os dias trabalhados do funcionário 1: ");
        int diasTrabalhados1 = scanner.nextInt();
        System.out.println("Digite o valor diário do funcionário 1: ");
        double valorDiario1 = scanner.nextDouble();

        System.out.println("Digite o nome do funcionário 2: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite os dias trabalhados do funcionário 2: ");
        int diasTrabalhados2 = scanner.nextInt();
        System.out.println("Digite o valor diário do funcionário 2: ");
        double valorDiario2 = scanner.nextDouble();

        Funcionario funcionario1 = new Funcionario(nome1, diasTrabalhados1, valorDiario1);
        Funcionario funcionario2 = new Funcionario(nome2, diasTrabalhados2, valorDiario2);
        

        System.out.println("Funcionário 1: " + funcionario1.toString());
        System.out.println("Funcionário 2: " + funcionario2.toString());

        System.out.println("São iguais? " + funcionario1.equals(funcionario2));

        System.out.println("Salário do funcionário 1: " + funcionario1.calculaSalario());
        System.out.println("Salário do funcionário 2: " + funcionario2.calculaSalario());

        System.out.println("Salário do funcionário 1 (método estático): " + Funcionario.calculaSalario(diasTrabalhados1, valorDiario1));
        System.out.println("Salário do funcionário 2 (método estático): " + Funcionario.calculaSalario(diasTrabalhados2, valorDiario2));
         System.out.println("Número de Funcionarios: " + Funcionario.getTotfunc());
        
    }
}