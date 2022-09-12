import java.util.Scanner;
import java.lang.Math;;

// Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
// quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro 
// para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que 
// custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem 
// compradas e o preço total

public class Ex016 {
    public static void main(String[] args) throws Exception {
        double areaPintar;
        
        int lataTinta;
        double preço;

         Scanner tc = new Scanner(System.in);
         System.out.println("Qual a area de pintura desejeada em m²?");
         areaPintar = tc.nextDouble();
         tc.close();
         lataTinta = (int) Math.ceil(areaPintar / 54);
         preço= lataTinta * 80;

         System.out.println("Será necessária "+ lataTinta + " latas de tinta, e o preço" +
         " a se pagar é de: "+ preço+" reais.");
    }
}
