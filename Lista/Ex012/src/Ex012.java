import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que 
//calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
public class Ex012 {
    public static void main(String[] args) throws Exception {
        double altura;
        double pesoIdeal;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = tc.nextDouble();
        tc.close();
        pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é de: " + pesoIdeal);
    }
}
