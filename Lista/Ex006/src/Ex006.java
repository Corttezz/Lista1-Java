//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) throws Exception {
        double raio;
        double area;
        double pi = 3.14;

        System.out.println("Digite o raio do círculo: ");

        Scanner tc = new Scanner(System.in);
        raio = tc.nextDouble();
        tc.close();
        
        area = pi * (raio * raio);

        System.out.println("A área do círculo é de: " + area);
    
    }
}
