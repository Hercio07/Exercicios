
package Ficha9;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        electrodomesticos ler = new electrodomesticos("Microondas", "Hisense", 2022, 3500);
        ler.vizualizarElectrodomestico();
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        
        String nome = "Hisense";
        String Modelo = "Geleira";
        int anoFrabrico = 10;
        double preco = 2030;
        electrodomesticos ler1 = new electrodomesticos(nome, Modelo, anoFrabrico, preco);
        System.out.println(ler1.getNome());
        System.out.println(ler1.getModelo());
        System.out.println(ler1.getAnoFrabrico());
        System.out.println(ler1.getPreco());
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        
        
       
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do electrodomestico");
        String Nome = scanner.nextLine();
        
        System.out.println("Digite o Modelo do electrodomestico");
        String modelo = scanner.nextLine();
        
        System.out.println("Digite o ano de fabrico:");
        int anoFabrico = scanner.nextInt();
     
        
        System.out.println("Digite o preco do electrodomestico");
        double Preco = scanner.nextDouble();
           
        electrodomesticos ele = new electrodomesticos(Nome, modelo, anoFrabrico, Preco);     
        ele.vizualizarElectrodomestico();
    }
}
