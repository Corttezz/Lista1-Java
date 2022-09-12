//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7
import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) throws Exception {
        double altura;
        double pesoIdealH;
        double pesoIdealM;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite sua altura");
        altura = tc.nextDouble();
        tc.close();
        pesoIdealH = (72.7 * altura) - 58;
        pesoIdealM = (62.1*altura) - 44.7;
        System.out.println("Caso homem, seu peso ideal é de:" + pesoIdealH);
        System.out.println("Caso mulher, seu peso ideal é de" + pesoIdealM);
    }
}
