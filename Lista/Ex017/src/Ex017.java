import java.util.Scanner;
import java.lang.Math;
//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
//quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
//cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, 
//que custam R$80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos 
//preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. 
//Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, 
//considere latas cheias.
public class Ex017 {
    public static void main(String[] args) throws Exception {
        double litrosPintar;
        int galao;
        int lataTinta;
        double preçoLata;
        double preçoGalao;
        int areaResto;
        int galaoResto;
        int lataResto;
        double preçoJunto;
        

         Scanner tc = new Scanner(System.in);
         System.out.println("Qual a área de pintura desejeada em m²?");
         litrosPintar = tc.nextDouble();
         tc.close();
         galao =  (int )Math.ceil(litrosPintar/21.6);
         lataTinta = (int) Math.ceil(litrosPintar / 108);
         preçoLata= lataTinta * 80;
         preçoGalao = galao*25;

         areaResto = (int) Math.ceil(litrosPintar % 108);
         galaoResto= (int )Math.ceil(areaResto/21.6);
         lataResto= lataTinta - 1;
         preçoJunto= (lataResto * 80) + (galaoResto * 25);

         System.out.println("O preço com "+lataTinta+" latas de tinta será: "+ preçoLata );
         System.out.println("O preço com "+galao+" o galoes será de: "+ preçoGalao);
         
         System.out.println("O preço juntando "+lataResto+" latas de tinta " +
         "com "+ galaoResto+" galões, fica "+preçoJunto+" reais");
         

         
    }
}
