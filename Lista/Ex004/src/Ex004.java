import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mediaNotas;

        System.out.println("Digite as 4 notas:");

        Scanner tc = new Scanner(System.in);
        nota1 = tc.nextDouble();
        nota2 = tc.nextDouble();
        nota3 = tc.nextDouble();
        nota4 = tc.nextDouble();
        tc.close();
        
        mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média das notas é de: " + mediaNotas);
    }
}
