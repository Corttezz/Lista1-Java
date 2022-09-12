//Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
import java.util.Scanner;

public class Ex009{
    public static void main(String[] args) throws Exception {
        double temperaturaF;
        double temperaturaC;

        System.out.println("Digite a temperatura em Fahrenheit:");

        Scanner tc = new Scanner(System.in);
        temperaturaF = tc.nextDouble();
        tc.close();

        temperaturaC= 5* ((temperaturaF-32)/9);

        System.out.println("A temperatura em graus Celsius é de: "+ temperaturaC);
    }
}
