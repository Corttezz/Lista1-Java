
// Faça um Programa que calcule a área de um quadrado, em seguida
// mostre o dobro desta área para o usuário.
import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) throws Exception {
        double lado;
        double area;
        double doubleArea;

        System.out.println("Digite o lado do quadrado: ");

        Scanner tc = new Scanner(System.in);
        lado = tc.nextDouble();
        tc.close();

        area = lado * lado;
        doubleArea = area * 2;

        System.out.println("A área do quadrado é de: " + area + " e seu dobro é: "
                + doubleArea);

    }
}
