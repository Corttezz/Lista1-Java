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
import java.util.Scanner;
import java.lang.Math;
public class Ex017 {
    public static void main(String[] args) throws Exception {
        double litrosPintar, folga, preçoLata, preçoGalao, despedícioLata, despedícioGalão, lataTinta2,
        galao2, preçoAll, desperdício;
        
        int galao, lataTinta;

        // Primeira parte do programa

        Scanner tc = new Scanner(System.in);
        System.out.println("Qual a área de pintura desejeada em m²?");
        litrosPintar = tc.nextDouble();
        tc.close();
        folga = litrosPintar * 1.1;
        galao = (int) Math.ceil(folga / 21.6);
        lataTinta = (int) Math.ceil(folga / 108);
        preçoLata = lataTinta * 80;
        preçoGalao = galao * 25;

        despedícioLata = (int) (lataTinta*108) - folga;
        despedícioGalão =  (int)(galao*21.6)- folga;

        // Segunda parte do programa

        lataTinta2 = lataTinta - 1;
        galao2 = (double) Math.ceil((folga - (lataTinta2 * 108))/21.6);
        desperdício =(int)((galao2* 21.6) + (lataTinta2*108))- folga;
        preçoAll = (galao2 * 25) + (lataTinta2 * 80);

        System.out.println("O preço com " + lataTinta + " latas de tinta será: " + preçoLata+
        " com desperdíco de "+despedícioLata+" litros de tinta.");
        System.out.println("O preço com " + galao + " o galoes será de: " + preçoGalao+
        "com desperdíco de "+despedícioGalão+" litros de tinta.");
        System.out.println("Juntando "+galao2+" galões e "+lataTinta2+" latas o preço será "+preçoAll+
        " porém com um despedício de apenas "+desperdício+" litros de tinta.");

    }
}

