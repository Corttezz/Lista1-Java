//Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Fahrenheit // F = C x 1,8 + 32
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) throws Exception {
        double temperaturaC;
        double temperaturaF;

        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius.");
        temperaturaC = tc.nextDouble();
        tc.close();
        temperaturaF = temperaturaC * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é de: "+ temperaturaF);
    }
}
